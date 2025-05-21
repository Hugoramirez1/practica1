package PracticaJava1.src.main.resources;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class ControlTardanzas {
    // Mapa para almacenar los horarios de turno
    private static final Map<String, LocalTime> HORARIOS_TURNO = new HashMap<>();
    
    static {
        HORARIOS_TURNO.put("mañana", LocalTime.of(6, 0));
        HORARIOS_TURNO.put("administrativo", LocalTime.of(7, 0));
        HORARIOS_TURNO.put("tarde", LocalTime.of(14, 30));
        HORARIOS_TURNO.put("noche", LocalTime.of(22, 30));
    }

    public static void main(String[] args) {
    Scanner scanner = null;
    try {
        scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del archivo de funcionarios:");
        String archivoFuncionarios = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del archivo de marcaciones:");
        String archivoMarcaciones = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del archivo de salida:");
        String archivoSalida = scanner.nextLine();
        
        // Asegúrate de llamar al método
        procesarArchivos(archivoFuncionarios, archivoMarcaciones, archivoSalida);
        
    } finally {
        if (scanner != null) {
            scanner.close();
        }
    }
}

    private static void procesarArchivos(String archivoFuncionarios, 
                                        String archivoMarcaciones, 
                                        String archivoSalida) {
        try (BufferedReader lectorFuncionarios = new BufferedReader(
                new FileReader(archivoFuncionarios));
             BufferedReader lectorMarcaciones = new BufferedReader(
                new FileReader(archivoMarcaciones));
             BufferedWriter escritorSalida = new BufferedWriter(
                new FileWriter(archivoSalida))) {
            
            // Leer y procesar funcionarios
            Map<String, String> funcionarios = new HashMap<>();
            String linea;
            while ((linea = lectorFuncionarios.readLine()) != null) {
                String[] partes = linea.split(", ");
                if (partes.length == 2) {
                    funcionarios.put(partes[0], partes[1]);
                }
            }

            // Procesar marcaciones y encontrar tardanzas
            while ((linea = lectorMarcaciones.readLine()) != null) {
                String[] partes = linea.split(", ");
                if (partes.length == 2) {
                    String nombreCompleto = partes[0];
                    String turno = funcionarios.get(nombreCompleto);
                    
                    if (turno != null) {
                        LocalDateTime fechaHoraMarcacion = LocalDateTime.parse(
                            partes[1], 
                            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                        );
                        
                        LocalTime horaTurno = HORARIOS_TURNO.get(turno);
                        if (horaTurno != null) {
                            LocalTime horaMarcacion = fechaHoraMarcacion.toLocalTime();
                            
                            if (horaMarcacion.isAfter(horaTurno)) {
                                escritorSalida.write(
                                    String.format("%s, %s%n", 
                                    nombreCompleto, 
                                    fechaHoraMarcacion.format(
                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                                    )
                                ));
                            }
                        }
                    }
                }
            }

            System.out.println("Procesamiento completado. Archivo de tardanzas generado.");
            
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
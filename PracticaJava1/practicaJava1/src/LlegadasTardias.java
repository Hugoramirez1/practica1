import javax.swing.*;
import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class LlegadasTardias {

    // Rango 1: 06:00:01 a 07:00:00
    static LocalTime inicioManana = LocalTime.of(6, 0, 1);
    static LocalTime finManana = LocalTime.of(7, 30);

    // Rango 2: 14:30:01 a 15:30:00
    static LocalTime inicioTarde = LocalTime.of(14, 30, 1);
    static LocalTime finTarde = LocalTime.of(15, 30);

    // Rango 3: 22:30:01 a 23:30:00
    static LocalTime inicioNoche = LocalTime.of(22, 30, 1);
    static LocalTime finNoche = LocalTime.of(23, 30);

    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona el archivo eventos.txt");

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoEntrada = fileChooser.getSelectedFile();
            File archivoSalida = new File("llegadas_tardias.txt");

            List<String> resultados = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    linea = linea.trim();

                    if (linea.isEmpty() || !linea.matches("^\\d+\\s+.*")) continue;

                    String[] partes = linea.split("\\s{2,}|\t");
                    if (partes.length >= 4) {
                        String fechaHoraStr = partes[2].trim();
                        String tipo = partes[3].trim();

                        if (!tipo.equalsIgnoreCase("Entrada")) continue;

                        try {
                            String horaStr = fechaHoraStr.split(" ")[1];
                            LocalTime hora = LocalTime.parse(horaStr);

                            // Evaluar si está dentro de algún rango de llegada tardía
                            if ((hora.isAfter(inicioManana.minusNanos(1)) && hora.isBefore(finManana.plusNanos(1))) ||
                                (hora.isAfter(inicioTarde.minusNanos(1)) && hora.isBefore(finTarde.plusNanos(1))) ||
                                (hora.isAfter(inicioNoche.minusNanos(1)) && hora.isBefore(finNoche.plusNanos(1)))) {
                                resultados.add(linea);
                            }

                        } catch (Exception e) {
                            System.out.println("Formato de hora inválido en línea: " + linea);
                        }
                    }
                }

                // Guardar resultados en archivo de salida
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
                    for (String evento : resultados) {
                        writer.write(evento);
                        writer.newLine();
                    }
                }

                System.out.println("✅ Llegadas tardías guardadas en: " + archivoSalida.getAbsolutePath());

            } catch (IOException e) {
                System.out.println("❌ Error al procesar archivos: " + e.getMessage());
            }
        } else {
            System.out.println("❌ No se seleccionó ningún archivo.");
        }
    }
}

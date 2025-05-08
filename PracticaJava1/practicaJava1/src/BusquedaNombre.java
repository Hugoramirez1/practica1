import java.util.Scanner;

public class BusquedaNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar array para los nombres
        String[] nombres = new String[5];
        
        // Pedir y guardar los nombres
        System.out.println("Por favor, ingresa 5 nombres:");
        for(int i = 0; i < nombres.length; i++) {
            System.out.print((i + 1) + ". Nombre: ");
            nombres[i] = scanner.nextLine();
        }
        
        // Mostrar nombres ingresados
        System.out.println("\nNombres ingresados:");
        for(int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
        
        // Buscar nombre
        System.out.print("\nIngresa un nombre para buscar: ");
        String nombreBuscar = scanner.nextLine().trim();
        
        boolean encontrado = false;
        for(String nombre : nombres) {
            if(nombre.equalsIgnoreCase(nombreBuscar.trim())) {
                encontrado = true;
                break;
            }
        }
        
        // Mostrar resultado
        System.out.println(encontrado ? 
            "\nEncontrado!" : 
            "\nNo encontrado!");
        
        scanner.close();
    }
}
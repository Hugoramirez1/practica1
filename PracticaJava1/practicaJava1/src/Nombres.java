//Crear un programa en Java que use un array unidimensional para almacenar nombres ingresados 
//por el usuario, y luego los muestre por pantalla usando bucles.

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear objeto Scanner para entrada del usuario

        // Definir un array para almacenar 5 nombres
        String[] nombres = new String[5];

        // Bucle para ingresar los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();  // Leer nombre y almacenarlo en el array
        }

        System.out.println("\nNombres ingresados:");

        // Bucle para mostrar los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre #" + (i + 1) + ": " + nombres[i]);
        }

        scanner.close();  // Cerrar el Scanner (buena práctica)
    }
}
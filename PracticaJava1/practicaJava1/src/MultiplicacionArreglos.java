// Alumno: Hugo Ramirez
//C.I: 3.267.722
//Curso: Segundo
//Materia: Informatica 3
//Fecha: 08/mayo/2025

import java.util.Scanner;

public class MultiplicacionArreglos {
    public static void main(String[] args) {
        //arreglos
        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[5];
        int[] arregloResultado = new int[5];
        
        // entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        //arreglo1
        System.out.println("Ingrese los valores para el primer arreglo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }
        
        //arreglo2
        System.out.println("\nIngrese los valores para el segundo arreglo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }
        
        //multiplicación de elementos
        for (int i = 0; i < 5; i++) {
            arregloResultado[i] = arreglo1[i] * arreglo2[i];
        }
        
        //imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("indice\tArreglo1\tArreglo2\tResultado");
        System.out.println("-".repeat(40));
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t%d\t%d\t%d%n", 
                i, arreglo1[i], arreglo2[i], arregloResultado[i]);
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}
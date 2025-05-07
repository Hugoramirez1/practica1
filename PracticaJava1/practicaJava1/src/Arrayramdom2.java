/*Ejercicio 4: bjetivo: Practicar la creación de arreglos grandes, el uso del bucle for, y la generación de números aleatorios en Java.

📋 Enunciado:
Crea un programa en Java que:

Declare un arreglo de 100 elementos de tipo entero.

Llene ese arreglo automáticamente con números aleatorios del 1 al 1000.

Muestre los números en consola.

💡 Pistas:
Usa Random rand = new Random();

Usa rand.nextInt(1000) + 1 para obtener un número entre 1 y 1000. */

import java.util.Random;

public class Arrayramdom2 {
    public static void main(String[] args) {
        // Declarar un arreglo de 100 elementos de tipo entero
        int[] numeros = new int[100];

        // Crear un objeto Random
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios del 1 al 1000
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1000) + 1; // genera número de 1 a 1000
        }

        // Mostrar los números generados
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}

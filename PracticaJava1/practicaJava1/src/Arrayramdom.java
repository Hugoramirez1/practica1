
/*Ejercicio 3: Objetivo: Aprender a trabajar con arreglos (arrays), el ciclo for, y la clase Random para generar números aleatorios en Java.

📋 Enunciado:
Crea un programa en Java que realice lo siguiente:

Declare un array de tipo entero de tamaño 10.

Cargue automáticamente el array con números aleatorios entre 1 y 100.

Muestre todos los números generados en consola.

💡 Pistas:
Usa la clase Random de java.util.

Los números deben estar dentro del rango del 1 al 100 (inclusive).

Puedes utilizar un bucle for para recorrer el array. */
import java.util.Random;

public class Arrayramdom {
    public static void main(String[] args) {
        // Declarar un array de enteros con tamaño 10
        int[] numeros = new int[10];

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Cargar automáticamente el array con números aleatorios del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // genera número entre 1 y 100
        }

        // Mostrar todos los números generados
        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número #" + (i + 1) + ": " + numeros[i]);
        }
    }
}

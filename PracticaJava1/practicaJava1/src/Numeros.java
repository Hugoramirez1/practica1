//Cargar automáticamente números del 1 al 10 y mostrar por pantalla

public class Numeros {
    public static void main(String[] args) {
        // Crear un array de enteros con capacidad para 10 números
        int[] numeros = new int[10];

        // Cargar automáticamente los números del 1 al 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // i+1 para que vaya de 1 a 10
        }

        // Mostrar los números por pantalla
        System.out.println("Números cargados automáticamente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en posición " + i + ": " + numeros[i]);
        }
    }
}


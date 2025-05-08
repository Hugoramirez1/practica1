import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar array y variable para la suma
        int[] numeros = new int[6];
        int suma = 0;
        
        // Pedir y guardar los números
        System.out.println("Por favor, ingresa 6 números:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Sumar cada número inmediatamente
        }
        
        // Mostrar resultados
        System.out.println("\nNúmeros ingresados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ". " + numeros[i]);
        }
        System.out.println("\nLa suma total es: " + suma);
        
        scanner.close();
    }
}

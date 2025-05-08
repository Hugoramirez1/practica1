import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar array
        int[] numeros = new int[7];
        
        // Pedir y guardar los números
        System.out.println("Por favor, ingresa 7 números:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar números originales
        System.out.println("\nNúmeros ingresados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ". " + numeros[i]);
        }
        
        // Mostrar números invertidos
        System.out.println("\nNúmeros en orden inverso:");
        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.println((numeros.length - i) + ". " + numeros[i]);
        }
        
        scanner.close();
    }
}

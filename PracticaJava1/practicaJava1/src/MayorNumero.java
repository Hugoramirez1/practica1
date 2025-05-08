import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variable para almacenar el mayor número
        int mayor = Integer.MIN_VALUE;
        
        // Pedir y procesar los 10 números
        System.out.println("Por favor, ingresa 10 números:");
        for(int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Número: ");
            int numero = scanner.nextInt();
            mayor = Math.max(mayor, numero);
        }
        
        // Mostrar el resultado
        System.out.println("\nEl número mayor ingresado fue: " + mayor);
        
        scanner.close();
    }
}
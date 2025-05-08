import java.util.Scanner;

public class CopiarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar arrays
        int[] arrayOriginal = new int[5];
        int[] arrayCopia = new int[5];
        
        // Pedir y guardar números en el array original
        System.out.println("Por favor, ingresa 5 números:");
        for(int i = 0; i < arrayOriginal.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            arrayOriginal[i] = scanner.nextInt();
        }
        
        // Copiar datos del array original al array copia
        for(int i = 0; i < arrayOriginal.length; i++) {
            arrayCopia[i] = arrayOriginal[i];
        }
        
        // Mostrar resultados
        System.out.println("\nArray original:");
        for(int i = 0; i < arrayOriginal.length; i++) {
            System.out.println((i + 1) + ". " + arrayOriginal[i]);
        }
        
        System.out.println("\nArray copia:");
        for(int i = 0; i < arrayCopia.length; i++) {
            System.out.println((i + 1) + ". " + arrayCopia[i]);
        }
        
        scanner.close();
    }
}

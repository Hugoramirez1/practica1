import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar array y contadores
        int[] numeros = new int[8];
        int positivos = 0;
        int negativos = 0;
        
        // Pedir y guardar los números
        System.out.println("Por favor, ingresa 8 números:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = scanner.nextInt();
            
            // Contar según el signo
            if(numeros[i] > 0) {
                positivos++;
            } else if(numeros[i] < 0) {
                negativos++;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Números ingresados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ". " + numeros[i]);
        }
        System.out.println("\nCantidad de números:");
        System.out.println("- Positivos: " + positivos);
        System.out.println("- Negativos: " + negativos);
        
        scanner.close();
    }
}

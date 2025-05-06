import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, mi querido " + nombre + "!");
        scanner.close();
    }
}


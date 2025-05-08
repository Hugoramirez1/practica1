import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar array y variable para la suma
        double[] calificaciones = new double[5];
        double suma = 0;
        
        // Pedir y guardar las calificaciones
        System.out.println("Por favor, ingresa las calificaciones de 5 estudiantes:");
        for(int i = 0; i < calificaciones.length; i++) {
            System.out.print((i + 1) + ". Calificación: ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }
        
        // Mostrar resultados
        System.out.println("\nCalificaciones ingresadas:");
        for(int i = 0; i < calificaciones.length; i++) {
            System.out.println((i + 1) + ". " + calificaciones[i]);
        }
        
        double promedio = suma / calificaciones.length;
        System.out.printf("\nEl promedio es: %.2f%n", promedio);
        
        scanner.close();
    }
}
// Clase Main.java para probar la implementación
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar elementos a la lista
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);

        // Mostrar los elementos de la lista
        lista.mostrarLista();  // Salida esperada: 10 -> 20 -> 30 -> null
    }
}


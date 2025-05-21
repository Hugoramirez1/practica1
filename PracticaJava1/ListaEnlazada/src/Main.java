public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Insertar al inicio
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);

        // Agregar al final
        lista.agregarAlFinal(40);
        lista.agregarAlFinal(50);

        // Mostrar lista
        lista.mostrarLista();  // Salida esperada: 10 -> 20 -> 30 -> 40 -> 50 -> null
    }
}


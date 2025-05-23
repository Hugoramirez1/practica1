// Clase ListaEnlazada.java
public class ListaEnlazada {
    private Nodo cabeza;

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para agregar un nodo al final
    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para mostrar todos los elementos de la lista
    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void insertarAlInicio(int i) {
        
        throw new UnsupportedOperationException("Unimplemented method 'insertarAlInicio'");
    }
}

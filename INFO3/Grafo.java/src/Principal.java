public class Principal {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Agregar ciudades como nodos
        grafo.agregarNodo("Asunción");
        grafo.agregarNodo("Luque");
        grafo.agregarNodo("San Lorenzo");
        grafo.agregarNodo("Fernando de la Mora");

        // Agregar conexiones
        grafo.agregarArista("Asunción", "Luque");
        grafo.agregarArista("Asunción", "San Lorenzo");
        grafo.agregarArista("San Lorenzo", "Fernando de la Mora");
        grafo.agregarArista("Luque", "Fernando de la Mora");

        // Mostrar el grafo
        grafo.mostrarGrafo();
    }
}


import java.util.*;

public class Grafo {
    private Map<String, List<String>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarNodo(String nodo) {
        adyacencia.putIfAbsent(nodo, new ArrayList<>());
    }

    public void agregarArista(String nodo1, String nodo2) {
        adyacencia.get(nodo1).add(nodo2);
        adyacencia.get(nodo2).add(nodo1); // porque es no dirigido
    }

    public void mostrarGrafo() {
        for (String nodo : adyacencia.keySet()) {
            System.out.println(nodo + " está conectado con: " + adyacencia.get(nodo));
        }
    }
}


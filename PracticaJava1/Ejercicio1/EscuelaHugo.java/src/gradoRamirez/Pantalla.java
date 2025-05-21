package gradoRamirez;

import java.util.Stack;

public class Pantalla {
    public static void main(String[] args) {
        // Crear pila de estudiantes
        Stack<Estudiante> pilaEstudiantes = new Stack<>();

        // Crear y agregar estudiantes con push
        Estudiante est1 = new Estudiante("Ana", "Ramirez", "Escuela Central", "6to");
        Estudiante est2 = new Estudiante("Luis", "Pérez", "Escuela Norte", "5to");
        Estudiante est3 = new Estudiante("Carla", "Martínez", "Escuela Sur", "4to");

        System.out.println("Agregando estudiantes a la pila (push):");
        pilaEstudiantes.push(est1);
        pilaEstudiantes.push(est2);
        pilaEstudiantes.push(est3);

        // Mostrar pila actual
        System.out.println("\nContenido de la pila (de arriba hacia abajo):");
        for (int i = pilaEstudiantes.size() - 1; i >= 0; i--) {
            pilaEstudiantes.get(i).mostrarDatos();
        }

        // Eliminar elementos con pop
        System.out.println("Eliminando estudiante del tope de la pila (pop):");
        Estudiante eliminado = pilaEstudiantes.pop();
        eliminado.mostrarDatos();

        // Mostrar pila actual luego del pop
        System.out.println("Contenido de la pila después del pop:");
        for (int i = pilaEstudiantes.size() - 1; i >= 0; i--) {
            pilaEstudiantes.get(i).mostrarDatos();
        }
    }
}

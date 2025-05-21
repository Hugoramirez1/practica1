package gradoRamirez;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String escuela;
    private String grado;

    public Estudiante(String nombre, String apellido, String escuela, String grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.escuela = escuela;
        this.grado = grado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getGrado() {
        return grado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    // Método para mostrar información del estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Escuela: " + escuela);
        System.out.println("Grado: " + grado);
        System.out.println("---------------------------");
    }
}


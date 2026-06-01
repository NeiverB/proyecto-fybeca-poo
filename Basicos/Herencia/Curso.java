public class Curso {
    private String nombre;
    private String instructor;
    private String duracion;

    public Curso() {
        System.out.println("Se creó curso");
    }

    public Curso(String nombre, String instructor, String duracion) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void acceso() {
        System.out.println("Acceso general al curso");
    }

    public void verDatos() {
        System.out.println("Curso: " + nombre);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duración: " + duracion);
    }
}

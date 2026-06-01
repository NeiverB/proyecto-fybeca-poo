public class Usuario {

    // Atributos privados
    private String nombre;
    private String apellido;
    private int telefono;

    // Constructor
    public Usuario(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Métodos protegidos del diagrama
    protected void mostrarNombre() {
        System.out.println("Nombre: " + nombre + " " + apellido);
    }

    protected void registrarUsuario() {
        System.out.println("Usuario registrado: " + nombre + " " + apellido +
                           " | Teléfono: " + telefono);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
}

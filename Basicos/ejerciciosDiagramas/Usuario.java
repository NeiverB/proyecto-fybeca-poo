package ejerciciosDiagramas;

public class Usuario extends Persona {
    private String telefono;

    public Usuario(String nombre, String apellido, String telefono) {
        super(nombre, apellido);
        this.telefono = telefono;
    }

    public String getTelefono() { return telefono; }

    @Override
    public void mostrarInfo() {
        System.out.println("Usuario: " + getNombre() + " " + getApellido() + " - Tel: " + telefono);
    }
}

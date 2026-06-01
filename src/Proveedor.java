public class Proveedor {
    private int id;
    private String nombre;
    private String telefono;
    private String correo;
    private String tipoProducto;

    public Proveedor() {}

    public Proveedor(int id, String nombre, String telefono, String correo, String tipoProducto) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoProducto = tipoProducto;
    }

    public void mostrarProveedor() { System.out.println(nombre); }
    public String getNombre() { return nombre; }
}

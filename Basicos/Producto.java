public class Producto {

    // Atributos privados
    private int idProducto;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método protegido del diagrama
    protected void mostrarProducto() {
        System.out.println("ID: " + idProducto +
                           " | Producto: " + nombre +
                           " | Precio: $" + String.format("%.2f", precio));
    }

    // Getters y Setters
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}

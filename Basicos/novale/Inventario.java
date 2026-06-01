public class Inventario {

    // Atributos privados
    private int codigo;
    private double cantidad;
    private String ubicacion;

    // Relación: Inventario tiene un Producto (1 a 0..*)
    private Producto producto;

    // Constructor
    public Inventario(int codigo, double cantidad, String ubicacion, Producto producto) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.producto = producto;
    }

    // Método protegido del diagrama
    protected void actualizarCantidad(double nuevaCantidad) {
        if (nuevaCantidad < 0) {
            System.out.println("Error: la cantidad no puede ser negativa.");
            return;
        }
        this.cantidad = nuevaCantidad;
        System.out.println("Inventario actualizado:");
        System.out.println("  Producto  : " + producto.getNombre());
        System.out.println("  Cantidad  : " + this.cantidad);
        System.out.println("  Ubicación : " + ubicacion);
    }

    public void mostrarInventario() {
        System.out.println("--- INVENTARIO ---");
        System.out.println("Código    : " + codigo);
        System.out.println("Producto  : " + producto.getNombre());
        System.out.println("Cantidad  : " + cantidad);
        System.out.println("Ubicación : " + ubicacion);
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}

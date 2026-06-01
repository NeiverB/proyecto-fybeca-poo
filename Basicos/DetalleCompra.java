public class DetalleCompra {

    // Atributos privados
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private double descuento;
    private double iva;

    // Relación: DetalleCompra corresponde a un Producto (1 a 1)
    private Producto producto;

    // Constructor
    public DetalleCompra(int cantidad, double descuento, double iva, Producto producto) {
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.iva = iva;
        this.producto = producto;
        this.precioUnitario = producto.getPrecio();
        this.subtotal = calcularSubtotal();
    }

    // Métodos protegidos del diagrama
    protected double calcularSubtotal() {
        double sub = cantidad * precioUnitario;
        double conDescuento = sub - calcularDescuento();
        double conIva = conDescuento + (conDescuento * iva / 100);
        this.subtotal = conIva;
        return this.subtotal;
    }

    protected double calcularDescuento() {
        return (cantidad * precioUnitario) * (descuento / 100);
    }

    public void mostrarDetalle() {
        System.out.println("  Producto     : " + producto.getNombre());
        System.out.println("  Cantidad     : " + cantidad);
        System.out.println("  Precio Unit. : $" + String.format("%.2f", precioUnitario));
        System.out.println("  Descuento    : " + descuento + "% ($" +
                           String.format("%.2f", calcularDescuento()) + ")");
        System.out.println("  IVA          : " + iva + "%");
        System.out.println("  Subtotal     : $" + String.format("%.2f", calcularSubtotal()));
    }

    // Getters y Setters
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public double getSubtotal() { return subtotal; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public double getIva() { return iva; }
    public void setIva(double iva) { this.iva = iva; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}

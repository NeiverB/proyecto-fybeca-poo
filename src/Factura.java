public class Factura {
    private int id;
    private String numeroFactura;
    private String fecha;
    private double total;
    private boolean activa;

    public Factura() {}

    public Factura(int id, String numeroFactura, String fecha, double total, boolean activa) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.total = total;
        this.activa = activa;
    }

    public boolean facturaActiva() { return activa; }
    public void generarFactura() { System.out.println("Factura generada"); }
}

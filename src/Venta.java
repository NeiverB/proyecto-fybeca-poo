public class Venta {
    private int id;
    private String fecha;
    private double total;
    private String metodoPago;
    private boolean completada;

    public Venta() {}

    public Venta(int id, String fecha, double total, String metodoPago, boolean completada) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
        this.completada = completada;
    }

    public boolean ventaAlta() { return total > 100; }
    public double calcularIva() { return total * 0.15; }

    public int getId() { return id; }
    public double getTotal() { return total; }
}

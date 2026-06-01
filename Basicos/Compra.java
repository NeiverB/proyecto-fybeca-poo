import java.util.ArrayList;
import java.util.Date;

public class Compra {

    // Atributos privados
    private Date fecha;
    private String hora;
    private double total;

    // Relación: Compra la realiza un Usuario (1 a muchos: 0..*)
    private Usuario usuario;

    // Relación: Compra contiene DetalleCompra (composición)
    private ArrayList<DetalleCompra> detalles;

    // Constructor
    public Compra(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.hora = String.format("%tT", this.fecha);
        this.detalles = new ArrayList<>();
        this.total = 0;
    }

    // Agregar un detalle a la compra
    public void agregarDetalle(DetalleCompra detalle) {
        detalles.add(detalle);
    }

    // Métodos protegidos del diagrama
    protected void registrarCompra() {
        this.total = calcularTotal();
        System.out.println("=== COMPRA REGISTRADA ===");
        System.out.println("Usuario : " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("Fecha   : " + fecha);
        System.out.println("Hora    : " + hora);
        System.out.println("-------------------------");
        for (DetalleCompra d : detalles) {
            d.mostrarDetalle();
            System.out.println("  -------------------------");
        }
        System.out.println("TOTAL   : $" + String.format("%.2f", total));
        System.out.println("=========================");
    }

    protected double calcularTotal() {
        double suma = 0;
        for (DetalleCompra d : detalles) {
            suma += d.calcularSubtotal();
        }
        this.total = suma;
        return this.total;
    }

    // Getters y Setters
    public Date getFecha() { return fecha; }
    public String getHora() { return hora; }
    public double getTotal() { return total; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public ArrayList<DetalleCompra> getDetalles() { return detalles; }
}

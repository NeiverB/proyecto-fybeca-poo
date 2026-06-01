public class TicketFacturacion extends TicketSoporte {
    private String tipoFactura;
    private String metodoPago;
    private String estado;

    public TicketFacturacion() {
        super();
    }

    public TicketFacturacion(String cliente, String descripcion, String fecha, String tipoFactura, String metodoPago, String estado) {
        super(cliente, descripcion, fecha);
        this.tipoFactura = tipoFactura;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    @Override
    public void area() {
        System.out.println("Área: Facturación");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Tipo factura: " + tipoFactura);
        System.out.println("Método pago: " + metodoPago);
        System.out.println("Estado: " + estado);
        area();
    }
}

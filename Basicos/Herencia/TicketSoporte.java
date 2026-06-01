public class TicketSoporte {
    private String cliente;
    private String descripcion;
    private String fecha;

    public TicketSoporte() {
        System.out.println("Se creó ticket de soporte");
    }

    public TicketSoporte(String cliente, String descripcion, String fecha) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void area() {
        System.out.println("Área general");
    }

    public void verDatos() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
    }
}
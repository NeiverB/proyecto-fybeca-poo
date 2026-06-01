public class TicketTecnico extends TicketSoporte {
    private String tipoProblema;
    private String prioridad;
    private String sistema;

    public TicketTecnico() {
        super();
    }

    public TicketTecnico(String cliente, String descripcion, String fecha, String tipoProblema, String prioridad, String sistema) {
        super(cliente, descripcion, fecha);
        this.tipoProblema = tipoProblema;
        this.prioridad = prioridad;
        this.sistema = sistema;
    }

    @Override
    public void area() {
        System.out.println("Área: Soporte Técnico");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Tipo problema: " + tipoProblema);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Sistema: " + sistema);
        area();
    }
}

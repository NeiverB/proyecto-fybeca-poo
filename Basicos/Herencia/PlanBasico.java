public class PlanBasico extends PlanSuscripcion {
    private String acceso;
    private String soporte;
    private String calidad;

    public PlanBasico() {
        super();
    }

    public PlanBasico(String nombrePlan, double precio, String duracion, String acceso, String soporte, String calidad) {
        super(nombrePlan, precio, duracion);
        this.acceso = acceso;
        this.soporte = soporte;
        this.calidad = calidad;
    }

    @Override
    public void mostrarBeneficios() {
        System.out.println("Acceso: " + acceso);
        System.out.println("Soporte: " + soporte);
        System.out.println("Calidad: " + calidad);
    }

    @Override
    public void verDatos() {
        super.verDatos();
        mostrarBeneficios();
    }
}

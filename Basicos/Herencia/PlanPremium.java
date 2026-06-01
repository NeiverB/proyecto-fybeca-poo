public class PlanPremium extends PlanSuscripcion {
    private String acceso;
    private String soporte;
    private String extras;

    public PlanPremium() {
        super();
    }

    public PlanPremium(String nombrePlan, double precio, String duracion, String acceso, String soporte, String extras) {
        super(nombrePlan, precio, duracion);
        this.acceso = acceso;
        this.soporte = soporte;
        this.extras = extras;
    }

    @Override
    public void mostrarBeneficios() {
        System.out.println("Acceso completo: " + acceso);
        System.out.println("Soporte prioritario: " + soporte);
        System.out.println("Extras: " + extras);
    }

    @Override
    public void verDatos() {
        super.verDatos();
        mostrarBeneficios();
    }
}
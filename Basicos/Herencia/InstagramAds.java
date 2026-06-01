public class InstagramAds extends CanpanaPublicitaria {
    private String formato;
    private String audiencia;
    private String duracion;

    public InstagramAds() {
        super();
    }

    public InstagramAds(String nombre, double presupuesto, String objetivo, String formato, String audiencia, String duracion) {
        super(nombre, presupuesto, objetivo);
        this.formato = formato;
        this.audiencia = audiencia;
        this.duracion = duracion;
    }

    @Override
    public void plataforma() {
        System.out.println("Ejecutando en Instagram Ads");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Formato: " + formato);
        System.out.println("Audiencia: " + audiencia);
        System.out.println("Duración: " + duracion);
        plataforma();
    }
}

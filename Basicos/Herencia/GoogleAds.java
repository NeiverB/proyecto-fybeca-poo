public class GoogleAds extends CanpanaPublicitaria {
    private String tipoAnuncio;
    private String palabrasClave;
    private String ubicacion;

    public GoogleAds() {
        super();
    }

    public GoogleAds(String nombre, double presupuesto, String objetivo, String tipoAnuncio, String palabrasClave, String ubicacion) {
        super(nombre, presupuesto, objetivo);
        this.tipoAnuncio = tipoAnuncio;
        this.palabrasClave = palabrasClave;
        this.ubicacion = ubicacion;
    }

    @Override
    public void plataforma() {
        System.out.println("Ejecutando en Google Ads");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Tipo de anuncio: " + tipoAnuncio);
        System.out.println("Palabras clave: " + palabrasClave);
        System.out.println("Ubicación: " + ubicacion);
        plataforma();
    }
}
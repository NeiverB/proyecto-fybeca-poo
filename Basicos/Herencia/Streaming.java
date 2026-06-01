public class Streaming extends ServicioDigital {
    private String plataforma;
    private String calidad;
    private String dispositivos;

    public Streaming() {
        super();
    }

    public Streaming(String nombre, double precio, String tipo, String plataforma, String calidad, String dispositivos) {
        super(nombre, precio, tipo);
        this.plataforma = plataforma;
        this.calidad = calidad;
        this.dispositivos = dispositivos;
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Calidad: " + calidad);
        System.out.println("Dispositivos: " + dispositivos);
    }
}

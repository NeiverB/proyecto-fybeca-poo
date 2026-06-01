public class Hosting extends ServicioDigital {
    private String almacenamiento;
    private String dominio;
    private String soporte;

    public Hosting() {
        super();
    }

    public Hosting(String nombre, double precio, String tipo, String almacenamiento, String dominio, String soporte) {
        super(nombre, precio, tipo);
        this.almacenamiento = almacenamiento;
        this.dominio = dominio;
        this.soporte = soporte;
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Dominio: " + dominio);
        System.out.println("Soporte: " + soporte);
    }
}
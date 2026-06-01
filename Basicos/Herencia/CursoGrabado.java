public class CursoGrabado extends Curso {
    private String plataforma;
    private String accesoTiempo;
    private String formato;

    public CursoGrabado() {
        super();
    }

    public CursoGrabado(String nombre, String instructor, String duracion, String plataforma, String accesoTiempo, String formato) {
        super(nombre, instructor, duracion);
        this.plataforma = plataforma;
        this.accesoTiempo = accesoTiempo;
        this.formato = formato;
    }

    @Override
    public void acceso() {
        System.out.println("Acceso en línea desde la plataforma: " + plataforma);
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Acceso: " + accesoTiempo);
        System.out.println("Formato: " + formato);
        acceso();
    }
}

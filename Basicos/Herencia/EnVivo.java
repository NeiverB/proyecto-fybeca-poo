public class EnVivo extends Curso {
    private String fecha;
    private String horario;
    private String enlace;

    public EnVivo() {
        super();
    }

    public EnVivo(String nombre, String instructor, String duracion, String fecha, String horario, String enlace) {
        super(nombre, instructor, duracion);
        this.fecha = fecha;
        this.horario = horario;
        this.enlace = enlace;
    }

    @Override
    public void acceso() {
        System.out.println("Acceso en vivo mediante enlace: " + enlace);
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Fecha: " + fecha);
        System.out.println("Horario: " + horario);
        System.out.println("Enlace: " + enlace);
        acceso();
    }
}
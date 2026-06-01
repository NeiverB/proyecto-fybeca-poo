public class VideoTikTok extends ContenidoDigital {
    private String duracion;
    private int vistas;
    private String musica;

    public VideoTikTok() {
        super();
    }

    public VideoTikTok(String titulo, String autor, String fecha, String duracion, int vistas, String musica) {
        super(titulo, autor, fecha);
        this.duracion = duracion;
        this.vistas = vistas;
        this.musica = musica;
    }

    @Override
    public void publicar() {
        System.out.println("Publicado en TikTok");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Duración: " + duracion);
        System.out.println("Vistas: " + vistas);
        System.out.println("Música: " + musica);
        publicar();
    }
}

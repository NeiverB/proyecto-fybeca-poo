public class PostFacebook extends ContenidoDigital {
    private String texto;
    private int likes;
    private int comentarios;

    public PostFacebook() {
        super();
    }

    public PostFacebook(String titulo, String autor, String fecha, String texto, int likes, int comentarios) {
        super(titulo, autor, fecha);
        this.texto = texto;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    @Override
    public void publicar() {
        System.out.println("Publicado en Facebook");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Texto: " + texto);
        System.out.println("Likes: " + likes);
        System.out.println("Comentarios: " + comentarios);
        publicar();
    }
}

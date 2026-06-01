public class ContenidoDigital {
    private String titulo;
    private String autor;
    private String fecha;

    public ContenidoDigital() {
        System.out.println("Se creó contenido digital");
    }

    public ContenidoDigital(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void publicar() {
        System.out.println("Publicando contenido...");
    }

    public void verDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
    }
}

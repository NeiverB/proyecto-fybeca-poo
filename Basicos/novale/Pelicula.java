public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;
    public void setTitulo(String titulo) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("El título no puede estar vacío.");
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void setDirector(String director) {
        if (!director.isEmpty()) {
            this.director = director;
        } else {
            System.out.println("El director no puede estar vacío.");
        }
    }
    public String getDirector() {
        return director;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos > 0) {
            this.duracionMinutos = duracionMinutos;
        } else {
            System.out.println("La duración debe ser mayor que cero.");
        }
    }
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}
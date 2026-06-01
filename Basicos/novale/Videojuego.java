public class Videojuego {
    private String titulo;
    private String genero;
    private double precio;
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
    public void setGenero(String genero) {
        if (!genero.isEmpty()) {
            this.genero = genero;
        } else {
            System.out.println("El género no puede estar vacío.");
        }
    }
    public String getGenero() {
        return genero;
    }
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public double getPrecio() {
        return precio;
    }
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Precio: $" + precio);
    }
}
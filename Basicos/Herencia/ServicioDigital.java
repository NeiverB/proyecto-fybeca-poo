public class ServicioDigital {
    private String nombre;
    private double precio;
    private String tipo;

    public ServicioDigital() {
        System.out.println("Se creó servicio digital");
    }

    public ServicioDigital(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void verDatos() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Tipo: " + tipo);
    }
}
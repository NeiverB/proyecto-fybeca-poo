public class ProductoDigital extends Producto {
    private double descuento;
    private String formato;
    private String plataforma;

    public ProductoDigital() {
        super();
    }

    public ProductoDigital(String nombre, String categoria, double precio,double descuento, String formato, String plataforma) {
        super(nombre, categoria, precio);
        this.descuento = descuento;
        this.formato = formato;
        this.plataforma = plataforma;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() - descuento;
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Descuento: $" + descuento);
        System.out.println("Formato: " + formato);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}

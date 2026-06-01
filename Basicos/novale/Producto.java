public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }
    public double getPrecio() {
        return precio;
    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }
    public int getStock() {
        return stock;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}
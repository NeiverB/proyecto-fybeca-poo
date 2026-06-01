public class Medicamento {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Medicamento() {}

    public Medicamento(int id, String nombre, String categoria, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean tieneStockBajo() { return stock < 10; }
    public double calcularValorInventario() { return precio * stock; }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}

public class Inventario {
    private int id;
    private int stockActual;
    private int stockMinimo;
    private String ubicacion;
    private boolean disponible;

    public Inventario() {}

    public Inventario(int id, int stockActual, int stockMinimo, String ubicacion, boolean disponible) {
        this.id = id;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
    }

    public boolean stockDisponible() { return stockActual > stockMinimo; }
}

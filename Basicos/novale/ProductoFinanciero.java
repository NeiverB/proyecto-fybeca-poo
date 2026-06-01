public class ProductoFinanciero {

    String nombreProducto;
    String tipo;
    double comision;

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Tipo: " + tipo);
        System.out.println("Comisión: $" + comision);
    }

    public void calcularCosto() {
        double costoTotal = comision + 2; // costo adicional fijo

        System.out.println("Costo total del producto: $" + costoTotal);
    }
}
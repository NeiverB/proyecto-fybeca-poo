public class FacturaElectronica {

    String numeroFactura;
    String cliente;
    double total;

    public void emitirFactura() {
        System.out.println("Factura emitida correctamente");
    }

    public void mostrarFactura() {
        System.out.println("Número de factura: " + numeroFactura);
        System.out.println("Cliente: " + cliente);
        System.out.println("Total a pagar: $" + total);
    }
}
public class TarjetaCredito {

    String numeroTarjeta;
    int limiteCredito;
    String banco;

    public void mostrarInfo() {
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        System.out.println("Banco: " + banco);
        System.out.println("Límite disponible: $" + limiteCredito);
    }

    public void realizarCompra() {

        int montoCompra = 200;

        if (limiteCredito >= montoCompra) {
            limiteCredito -= montoCompra;
            System.out.println("Compra realizada por $" + montoCompra);
        } else {
            System.out.println("Crédito insuficiente");
        }
    }
}
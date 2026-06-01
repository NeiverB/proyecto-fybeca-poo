public class PagoTarjeta extends MetodoPago {
    private String numeroTarjeta;
    private String banco;
    private String tipo;

    public PagoTarjeta() {
        super();
    }

    public PagoTarjeta(String titular, double monto, String moneda, String numeroTarjeta, String banco, String tipo) {
        super(titular, monto, moneda);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipo = tipo;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago realizado con tarjeta");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Tarjeta: " + numeroTarjeta);
        System.out.println("Banco: " + banco);
        System.out.println("Tipo: " + tipo);
        procesarPago();
    }
}

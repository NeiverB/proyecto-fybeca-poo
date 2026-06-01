public class PayPal extends MetodoPago {
    private String correo;
    private String idCuenta;
    private String pais;

    public PayPal() {
        super();
    }

    public PayPal(String titular, double monto, String moneda, String correo, String idCuenta, String pais) {
        super(titular, monto, moneda);
        this.correo = correo;
        this.idCuenta = idCuenta;
        this.pais = pais;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago realizado con PayPal");
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Correo: " + correo);
        System.out.println("ID Cuenta: " + idCuenta);
        System.out.println("País: " + pais);
        procesarPago();
    }
}

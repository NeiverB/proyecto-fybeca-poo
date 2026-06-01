public class MetodoPago {
    private String titular;
    private double monto;
    private String moneda;

    public MetodoPago() {
        System.out.println("Se creó método de pago");
    }

    public MetodoPago(String titular, double monto, String moneda) {
        this.titular = titular;
        this.monto = monto;
        this.moneda = moneda;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void procesarPago() {
        System.out.println("Procesando pago...");
    }

    public void verDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Monto: $" + monto);
        System.out.println("Moneda: " + moneda);
    }
}

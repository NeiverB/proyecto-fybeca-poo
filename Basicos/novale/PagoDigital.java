public class PagoDigital {

    String plataforma;
    double monto;
    String estadoPago;

    public void procesarPago() {

        if (monto > 0) {
            estadoPago = "Completado";
            System.out.println("Pago procesado correctamente en " + plataforma);
        } else {
            estadoPago = "Fallido";
            System.out.println("Error en el pago");
        }
    }

    public void mostrarEstado() {
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Monto: $" + monto);
        System.out.println("Estado del pago: " + estadoPago);
    }
}

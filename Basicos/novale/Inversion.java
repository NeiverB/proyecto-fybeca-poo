public class Inversion {

    String tipoInversion;
    double montoInvertido;
    int plazo;

    public void invertir() {
        System.out.println("Inversión realizada correctamente");
    }

    public void mostrarInversion() {
        System.out.println("Tipo de inversión: " + tipoInversion);
        System.out.println("Monto invertido: $" + montoInvertido);
        System.out.println("Plazo: " + plazo + " meses");
    }
}

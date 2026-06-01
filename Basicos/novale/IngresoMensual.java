public class IngresoMensual {

    String mes;
    double monto;
    String fuenteIngreso;

    public void registrarIngreso() {
        System.out.println("Ingreso registrado correctamente");
    }

    public void mostrarResumen() {
        System.out.println("Mes: " + mes);
        System.out.println("Monto: $" + monto);
        System.out.println("Fuente de ingreso: " + fuenteIngreso);
    }
}
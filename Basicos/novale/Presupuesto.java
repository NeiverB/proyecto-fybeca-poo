public class Presupuesto {

    String mes;
    double montoAsignado;
    String responsable;

    public void crearPresupuesto() {
        System.out.println("Presupuesto creado correctamente");
    }

    public void mostrarPresupuesto() {
        System.out.println("Mes: " + mes);
        System.out.println("Monto asignado: $" + montoAsignado);
        System.out.println("Responsable: " + responsable);
    }
}

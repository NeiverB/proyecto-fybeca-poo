public class PlanSuscripcion {
    private String nombrePlan;
    private double precio;
    private String duracion;

    public PlanSuscripcion() {
        System.out.println("Se creó plan de suscripción");
    }

    public PlanSuscripcion(String nombrePlan, double precio, String duracion) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
        this.duracion = duracion;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void mostrarBeneficios() {
        System.out.println("Beneficios generales del plan");
    }

    public void verDatos() {
        System.out.println("Plan: " + nombrePlan);
        System.out.println("Precio: $" + precio);
        System.out.println("Duración: " + duracion);
    }
}
public class CanpanaPublicitaria {
    private String nombre;
    private double presupuesto;
    private String objetivo;

    public CanpanaPublicitaria() {
        System.out.println("Se creó campaña publicitaria");
    }

    public CanpanaPublicitaria(String nombre, double presupuesto, String objetivo) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.objetivo = objetivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void plataforma() {
        System.out.println("Plataforma general");
    }

    public void verDatos() {
        System.out.println("Campaña: " + nombre);
        System.out.println("Presupuesto: $" + presupuesto);
        System.out.println("Objetivo: " + objetivo);
    }
}
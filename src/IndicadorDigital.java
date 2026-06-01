public class IndicadorDigital {
    private int id;
    private String nombre;
    private String descripcion;
    private double puntaje;
    private String areaRelacionada;

    public IndicadorDigital() {}

    public IndicadorDigital(int id, String nombre, String descripcion, double puntaje, String areaRelacionada) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.areaRelacionada = areaRelacionada;
    }

    public boolean estaCumplido() { return puntaje >= 70; }

    public String obtenerEstado() {
        return puntaje >= 70 ? "Cumplido" : "Pendiente";
    }
}

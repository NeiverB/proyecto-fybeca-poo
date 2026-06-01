public class Empresa {
    private int id;
    private String nombre;
    private String sector;
    private String ciudad;
    private int numeroEmpleados;
    private boolean tieneCanalesDigitales;

    public Empresa() {}

    public Empresa(int id, String nombre, String sector, String ciudad, int numeroEmpleados, boolean tieneCanalesDigitales) {
        this.id = id;
        this.nombre = nombre;
        this.sector = sector;
        this.ciudad = ciudad;
        this.numeroEmpleados = numeroEmpleados;
        this.tieneCanalesDigitales = tieneCanalesDigitales;
    }

    public String obtenerTamanoEmpresa() {
        if (numeroEmpleados <= 10) return "Microempresa";
        else if (numeroEmpleados <= 50) return "Pequeña empresa";
        else return "Mediana o grande";
    }

    public String getNombre() { return nombre; }
}

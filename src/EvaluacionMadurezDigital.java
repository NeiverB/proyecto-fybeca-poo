public class EvaluacionMadurezDigital {
    private int id;
    private String fechaEvaluacion;
    private double puntajeTransformacionDigital;
    private double puntajeAutomatizacion;
    private double puntajePresenciaDigital;
    private double puntajeUsoDatos;

    public EvaluacionMadurezDigital() {}

    public EvaluacionMadurezDigital(int id, String fechaEvaluacion,
            double puntajeTransformacionDigital, double puntajeAutomatizacion,
            double puntajePresenciaDigital, double puntajeUsoDatos) {
        this.id = id;
        this.fechaEvaluacion = fechaEvaluacion;
        this.puntajeTransformacionDigital = puntajeTransformacionDigital;
        this.puntajeAutomatizacion = puntajeAutomatizacion;
        this.puntajePresenciaDigital = puntajePresenciaDigital;
        this.puntajeUsoDatos = puntajeUsoDatos;
    }

    public double calcularPromedio() {
        return (puntajeTransformacionDigital + puntajeAutomatizacion +
                puntajePresenciaDigital + puntajeUsoDatos) / 4;
    }

    public String obtenerNivelMadurezDigital() {
        double promedio = calcularPromedio();
        if (promedio >= 80) return "Alto";
        else if (promedio >= 50) return "Medio";
        else return "Bajo";
    }
}

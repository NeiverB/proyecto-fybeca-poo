public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("La marca no puede estar vacía.");
        }
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("El modelo no puede estar vacío.");
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setAnio(int anio) {
        if (anio > 1900) {
            this.anio = anio;
        } else {
            System.out.println("El año debe ser mayor que 1900.");
        }
    }
    public int getAnio() {
        return anio;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
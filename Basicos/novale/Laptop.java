public class Laptop extends Producto {

    // Atributos privados propios
    private String marca;
    private int procesador;
    private String ram;

    // Constructor
    public Laptop(int idProducto, String nombre, double precio,
                  String marca, int procesador, String ram) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    // Método protegido del diagrama
    protected void mostrarLaptop() {
        System.out.println("--- LAPTOP ---");
        mostrarProducto(); // llama al método del padre
        System.out.println("Marca     : " + marca);
        System.out.println("Procesador: " + procesador + " GHz");
        System.out.println("RAM       : " + ram);
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getProcesador() { return procesador; }
    public void setProcesador(int procesador) { this.procesador = procesador; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
}

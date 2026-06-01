public class ProductoFisico extends Producto {
    private double envio;
    private String peso;
    private String proveedor;

    public ProductoFisico() {
        super();
    }

    public ProductoFisico(String nombre, String categoria, double precio,double envio, String peso, String proveedor) {
        super(nombre, categoria, precio);
        this.envio = envio;
        this.peso = peso;
        this.proveedor = proveedor;
    }

    public void setEnvio(double envio) {
        this.envio = envio;
    }

    public double getEnvio() {
        return envio;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + envio;
    }

    @Override
    public void verDatos() {
        super.verDatos();
        System.out.println("Envío: $" + envio);
        System.out.println("Peso: " + peso);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}
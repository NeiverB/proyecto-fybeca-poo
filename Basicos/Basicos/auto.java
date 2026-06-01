public class Auto {
    String marca;
    String modelo;
    int anio;
    double precio;

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
    }

    void mostrarInfo2() {
        System.out.println("Modelo: " + modelo);
    }

    void mostrarInfo3() {
        System.out.println("Año: " + anio);
    }

    void mostrarPrecio() {
        System.out.println("Precio: $" + precio);
    }
}
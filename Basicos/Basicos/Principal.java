public class Principal {
    public static void main(String[] args) {

        Auto auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.modelo = "Hilux";
        auto1.anio = 2025;
        auto1.precio = 60000;

        auto1.mostrarInfo();
        auto1.mostrarInfo2();
        auto1.mostrarInfo3();
        auto1.mostrarPrecio();
    }
}
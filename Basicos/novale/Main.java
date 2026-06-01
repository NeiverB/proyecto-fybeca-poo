public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("    SISTEMA DE PRODUCTOS - EJERCICIO 2  ");
        System.out.println("========================================\n");

        // 1. Crear productos de cada tipo (herencia de Producto)
        Celular celular = new Celular(1, "Samsung Galaxy S24", 799.99,
                                     "Samsung", "Galaxy S24", 256);

        Laptop laptop = new Laptop(2, "Lenovo ThinkPad X1", 1200.00,
                                   "Lenovo", 4, "16 GB DDR5");

        Accesorios accesorio = new Accesorios(3, "Audífonos Bluetooth", 45.00,
                                              "Auricular", "Negro", "Universal");

        // 2. Mostrar cada producto con sus datos específicos
        celular.mostrarCelular();
        System.out.println();

        laptop.mostrarLaptop();
        System.out.println();

        accesorio.mostrarAccesorios();
        System.out.println();

        // 3. Crear una Categoria y clasificar productos
        Categoria catElectronicos = new Categoria(1, "Electrónicos",
                                                  "Dispositivos electrónicos de alto rendimiento");
        catElectronicos.agregarProducto(celular);
        catElectronicos.agregarProducto(laptop);

        Categoria catAccesorios = new Categoria(2, "Accesorios",
                                                "Complementos y periféricos");
        catAccesorios.agregarProducto(accesorio);

        catElectronicos.mostrarCategoria();
        System.out.println();
        catAccesorios.mostrarCategoria();
        System.out.println();

        // 4. Crear Inventario y vincular con productos
        Inventario inv1 = new Inventario(101, 50, "Bodega A - Estante 1", celular);
        Inventario inv2 = new Inventario(102, 20, "Bodega A - Estante 2", laptop);
        Inventario inv3 = new Inventario(103, 100, "Bodega B - Estante 1", accesorio);

        System.out.println("=== INVENTARIO INICIAL ===");
        inv1.mostrarInventario();
        System.out.println();
        inv2.mostrarInventario();
        System.out.println();
        inv3.mostrarInventario();
        System.out.println();

        // 5. Actualizar cantidad en inventario
        System.out.println("=== ACTUALIZANDO INVENTARIO ===");
        inv1.actualizarCantidad(45); // vendimos 5 celulares
        System.out.println();
        inv3.actualizarCantidad(120); // llegaron más accesorios
    }
}

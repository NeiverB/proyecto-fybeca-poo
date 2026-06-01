public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   SISTEMA DE COMPRAS - DEMO COMPLETA  ");
        System.out.println("========================================\n");

        // 1. Crear un Usuario
        Usuario usuario = new Usuario("Carlos", "López", 987654321);
        usuario.mostrarNombre();
        usuario.registrarUsuario();

        System.out.println();

        // 2. Crear una Cuenta vinculada al Usuario
        Cuenta cuenta = new Cuenta("carlos.lopez", 1234, usuario);
        boolean acceso = cuenta.validarLogin("carlos.lopez", 1234);

        System.out.println();

        // 3. Crear Productos
        Producto p1 = new Producto(1, "Laptop Lenovo", 850.00);
        Producto p2 = new Producto(2, "Mouse Inalámbrico", 25.50);
        Producto p3 = new Producto(3, "Teclado Mecánico", 65.00);

        System.out.println("--- Catálogo de productos ---");
        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();

        System.out.println();

        // 4. Crear Detalles de Compra (cantidad, descuento %, iva %, producto)
        DetalleCompra d1 = new DetalleCompra(1, 10.0, 12.0, p1); // 1 Laptop, 10% desc, 12% IVA
        DetalleCompra d2 = new DetalleCompra(2, 5.0,  12.0, p2); // 2 Mouse,  5% desc, 12% IVA
        DetalleCompra d3 = new DetalleCompra(1, 0.0,  12.0, p3); // 1 Teclado, sin desc, 12% IVA

        // 5. Crear la Compra y agregar detalles
        Compra compra = new Compra(usuario);
        compra.agregarDetalle(d1);
        compra.agregarDetalle(d2);
        compra.agregarDetalle(d3);

        // 6. Registrar la compra (imprime el resumen completo)
        compra.registrarCompra();

        System.out.println();

        // 7. Cerrar sesión
        cuenta.cerrarSesion();
    }
}

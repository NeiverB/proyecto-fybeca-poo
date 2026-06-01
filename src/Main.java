public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                1,
                "Juan Perez",
                "juan@gmail.com",
                "0999999999",
                "Cuenca"
        );
        Medicamento medicamento = new Medicamento(
                1,
                "Paracetamol",
                "Analgesico",
                5.50,
                8
        );
        Venta venta = new Venta(
                1,
                "2026-05-28",
                25.00,
                "Tarjeta",
                true
        );
        Factura factura = new Factura(
                1,
                "FAC-001",
                "2026-05-28",
                25.00,
                true
        );
        Inventario inventario = new Inventario(
                1,
                8,
                5,
                "Percha A1",
                true
        );
        Proveedor proveedor = new Proveedor(
                1,
                "Laboratorios Quito",
                "0988888888",
                "ventas@laboratorios.com",
                "Medicamentos"
        );
        Empresa empresa = new Empresa(
                1,
                "Fybeca",
                "Farmacia",
                "Cuenca",
                40,
                true
        );
        EvaluacionMadurezDigital evaluacion =
                new EvaluacionMadurezDigital(
                        1,
                        "2026-05-28",
                        80,
                        70,
                        90,
                        75
                );
        IndicadorDigital indicador = new IndicadorDigital(
                1,
                "Automatizacion",
                "Nivel de automatizacion",
                85,
                "Operaciones"
        );
        System.out.println("===== SISTEMA FYBECA =====");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Medicamento: " + medicamento.getNombre());
        System.out.println("Stock bajo: " + medicamento.tieneStockBajo());
        System.out.println("Venta alta: " + venta.ventaAlta());
        System.out.println("Factura emitida: " + factura.facturaActiva());
        System.out.println("Proveedor: " + proveedor.getNombre());
        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Tamaño empresa: " + empresa.obtenerTamanoEmpresa());
        System.out.println("Promedio digital: " + evaluacion.calcularPromedio());
        System.out.println("Nivel digital: " + evaluacion.obtenerNivelMadurezDigital());
        System.out.println("Indicador cumplido: " + indicador.estaCumplido());
    }
}

public class Principal {
    public static void main(String[] args) {
        // Crear al menos 2 facturas:
        // Una con RFC
        Factura facturaConRfc = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Otra sin RFC (null)
        Factura facturaSinRfc = new Factura(1800.0, "Reparación de equipo", null);

        // Imprimir el resumen de ambas facturas usando el método getResumen()
        System.out.println(facturaConRfc.getResumen());
        System.out.println(facturaSinRfc.getResumen());
    }
}

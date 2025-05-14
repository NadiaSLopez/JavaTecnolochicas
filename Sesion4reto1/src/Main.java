public class Main {
    public static void main(String[] args) {
        // Crea dos facturas con el mismo folio pero diferentes clientes o totales
        Factura factura1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1600.50); // Diferente cliente y total

        // Muestra ambas facturas con toString()
        System.out.println(factura1);
        System.out.println(factura2);

        // Compara si son iguales con equals()
        boolean sonIguales = factura1.equals(factura2);
        System.out.println("¿Las facturas son iguales?: " + sonIguales);

        // Crear otra factura con diferente folio
        Factura factura3 = new Factura("FAC002", "Laura Gómez", 200.0);
        System.out.println(factura1.equals(factura3)); // Debería ser false
    }
}
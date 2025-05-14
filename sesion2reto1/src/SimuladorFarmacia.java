import java.util.Scanner;

class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del medicamento: ");
        String nombreMedicamento = scanner.nextLine();

        System.out.print("Ingrese el precio unitario: $");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidadPiezas = scanner.nextInt();

        double totalSinDescuento = precioUnitario * cantidadPiezas;
        double descuento = totalSinDescuento > 500.00 ? totalSinDescuento * 0.15 : 0.0;
        double totalAPagar = totalSinDescuento - descuento;
        boolean aplicaDescuento = descuento > 0;

        System.out.println("\n--- Resumen de la Compra ---");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: $" + String.format("%.2f", precioUnitario));
        System.out.println("Total sin descuento: $" + String.format("%.2f", totalSinDescuento));
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + String.format("%.2f", descuento));
        System.out.println("Total a pagar: $" + String.format("%.2f", totalAPagar));

        scanner.close();
    }
}
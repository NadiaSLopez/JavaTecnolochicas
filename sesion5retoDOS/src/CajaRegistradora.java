public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable auth = (Autenticable) pago;
                if (auth.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                    System.out.println();
                } else {
                    System.out.println("❌ Fallo de autenticación. " +
                            (pago instanceof PagoTransferencia ? "Transferencia no válida." : "Pago no autorizado."));
                    System.out.println();
                }
            }
        }
    }
}
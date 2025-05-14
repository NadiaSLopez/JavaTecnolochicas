// Clase CajaRegistradora
public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] metodosPago = new MetodoPago[3];
        metodosPago[0] = new PagoEfectivo(150.0);
        metodosPago[1] = new PagoTarjeta(320.0, 500.0);
        metodosPago[2] = new PagoTransferencia(100.0);

        for (MetodoPago metodoPago : metodosPago) {
            if (metodoPago instanceof Autenticable) {
                Autenticable autenticable = (Autenticable) metodoPago;
                if (autenticable.autenticar()) {
                    metodoPago.procesarPago();
                    metodoPago.mostrarResumen();
                    System.out.println();
                } else {
                    System.out.println();
                }
            } else {
                metodoPago.procesarPago();
                metodoPago.mostrarResumen();
                System.out.println();
            }
        }
    }
}

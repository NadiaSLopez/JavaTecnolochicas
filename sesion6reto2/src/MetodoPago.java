import java.util.Random;

// Interfaz Autenticable
interface Autenticable {
    boolean autenticar();
}

// Clase abstracta MetodoPago
abstract class MetodoPago {
    double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + getClass().getSimpleName() + " - Monto: $" + String.format("%.2f", monto));
    }
}

// Clases concretas
class PagoEfectivo extends MetodoPago implements Autenticable {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        System.out.println("✅ Autenticación exitosa.");
        return true; // El efectivo no requiere validación
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + String.format("%.2f", monto));
    }
}

class PagoTarjeta extends MetodoPago implements Autenticable {
    private double fondosDisponibles;

    public PagoTarjeta(double monto, double fondosDisponibles) {
        super(monto);
        this.fondosDisponibles = fondosDisponibles;
    }

    @Override
    public boolean autenticar() {
        if (fondosDisponibles >= monto) {
            System.out.println("✅ Autenticación exitosa.");
            return true;
        } else {
            System.out.println("❌ Fallo de autenticación. Fondos insuficientes.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + String.format("%.2f", monto));
        fondosDisponibles -= monto; // Simular débito
    }
}

class PagoTransferencia extends MetodoPago implements Autenticable {
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // Simular validación bancaria externa (aleatorio)
        Random random = new Random();
        boolean validacionExitosa = random.nextBoolean();
        if (validacionExitosa) {
            System.out.println("✅ Autenticación exitosa.");
            return true;
        } else {
            System.out.println("❌ Fallo de autenticación. Transferencia no válida.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando pago por transferencia por $" + String.format("%.2f", monto));
        // Simular comunicación bancaria
    }
}


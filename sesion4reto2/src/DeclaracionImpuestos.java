import java.util.Objects;

// Record DeclaracionImpuestos
record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {
}

// Clase tradicional CuentaFiscal
class CuentaFiscal {
    private final String rfc; // No modificable una vez asignado
    private double saldoDisponible;

    // Constructor con validación para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldoDisponible = saldoDisponible;
    }

    // Getters para ambos atributos
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Método validarRFC(DeclaracionImpuestos d) que compara el RFC
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }
}
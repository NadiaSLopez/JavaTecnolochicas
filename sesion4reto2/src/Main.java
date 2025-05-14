public class Main {
    public static void main(String[] args) {
        // Crea una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Crea una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Muestra la información de ambas
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + String.format("%.2f", declaracion.montoDeclarado()));
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() + ", saldo disponible: $" + String.format("%.2f", cuenta.getSaldoDisponible()));

        // Valida si el RFC coincide y muestra el resultado
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);

        System.out.println("\n--- Probando con RFC diferente ---");
        DeclaracionImpuestos otraDeclaracion = new DeclaracionImpuestos("YYYY999999ZZZ", 1000.0);
        boolean otroRfcValido = cuenta.validarRFC(otraDeclaracion);
        System.out.println("📄 Declaración enviada por RFC: " + otraDeclaracion.rfcContribuyente() + " por $" + String.format("%.2f", otraDeclaracion.montoDeclarado()));
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + otroRfcValido);

        try {
            CuentaFiscal cuentaNegativa = new CuentaFiscal("ZZZZ111111AAA", -500.0);
            System.out.println("Esto no debería imprimirse.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n--- Probando saldo negativo ---");
            System.out.println("Error al crear cuenta: " + e.getMessage());
        }
    }
}
import java.util.Scanner;

class CajeroAutomatico {
    public static void main(String[] args) {
        var saldo = 1000.0; // Inferencia de tipo: saldo es double

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + String.format("%.2f", saldo));
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + String.format("%.2f", saldo));
                    } else {
                        System.out.println("El monto a depositar debe ser mayor que cero.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0) {
                        if (saldo >= retiro) {
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Nuevo saldo: $" + String.format("%.2f", saldo));
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("El monto a retirar debe ser mayor que cero.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
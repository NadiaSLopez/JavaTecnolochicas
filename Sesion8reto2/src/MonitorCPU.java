import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> consumos = new HashSet<>();

        try {
            System.out.println("=== Monitor de CPU - Ingreso de Consumo ===");

            while (true) {
                System.out.print("\nIngrese el consumo de CPU del servidor (0-100) o 'salir' para terminar: ");
                String entrada = scanner.nextLine().trim();

                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                }

                int consumo;
                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Error: Debe ingresar un número válido.");
                    continue;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("⚠️ Error: El consumo debe estar entre 0 y 100.");
                    continue;
                }

                if (!consumos.add(consumo)) {
                    System.out.println("⚠️ Error: Este valor ya fue registrado.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🚨 Alerta crítica: el consumo de CPU ha superado el 95%.");
                }

                System.out.println("✅ Consumo registrado correctamente: " + consumo + "%");
            }

            System.out.println("\n📊 Registro final de consumos únicos:");
            for (int c : consumos) {
                System.out.println("- " + c + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\n🔒 Recursos cerrados. Fin del monitoreo.");
        }
    }
}
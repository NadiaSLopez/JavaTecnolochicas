import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Utilizar la clase Scanner para solicitar datos desde la consola
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

        System.out.print("Ingrese el número de expediente del paciente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        // Llamar al método mostrarInformacion() para mostrar los datos en consola
        System.out.println("\n--- Información del Paciente ---");
        paciente1.mostrarInformacion();

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
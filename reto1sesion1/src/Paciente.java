import java.util.Scanner;

// Clase Paciente
class Paciente {
    // Atributos de la clase Paciente
    String nombre;
    int edad;
    String numeroExpediente;

    // Método público para mostrar la información del paciente
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
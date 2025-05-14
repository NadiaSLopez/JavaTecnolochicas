
// Clase Principal
public class Principal {
    public static void main(String[] args) {
        // Crea al menos dos objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Concierto de Rock", 750.50);
        Entrada entrada2 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada3 = new Entrada("Festival de Cine", 200.75);

        // Llama al método mostrarInformacion() para mostrar los datos en consola
        System.out.println("--- Información de las Entradas ---");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
    }
}
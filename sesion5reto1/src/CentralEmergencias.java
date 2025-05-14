// Clase principal
public class CentralEmergencias {
    public static void main(String[] args) {
        // Crea una instancia de cada tipo de unidad
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        // Llama al método iniciarOperacion() en cada una
        ambulancia.iniciarOperacion();
        System.out.println(); // Separador

        patrulla.iniciarOperacion();
        System.out.println(); // Separador

        bomberos.iniciarOperacion();
    }
}
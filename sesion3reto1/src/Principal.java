// 3. En la clase Principal
public class Principal {
    public static void main(String[] args) {
        // Crear al menos un pasajero y un vuelo
        Pasajero pasajero1 = new Pasajero("Lena Marie", "ABC12345");
        Vuelo vuelo1 = new Vuelo("AV001", "Ciudad de México", "10:00");

        // Mostrar el itinerario inicial
        System.out.println(vuelo1.obtenerItinerario());

        // Reservar el asiento en el vuelo
        vuelo1.reservarAsiento(pasajero1);

        // Mostrar el itinerario después de la reserva
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar la reserva
        vuelo1.cancelarReserva();

        // Mostrar nuevamente el itinerario después de la cancelación
        System.out.println(vuelo1.obtenerItinerario());

        System.out.println("\n--- Reservando con nombre y pasaporte ---");
        // Reservar un asiento en el vuelo usando un nombre y pasaporte
        vuelo1.reservarAsiento("Carlos Pérez", "XYZ98765");

        // Mostrar el itinerario después de la segunda reserva
        System.out.println(vuelo1.obtenerItinerario());

        // Intentar reservar nuevamente el mismo asiento
        vuelo1.reservarAsiento(new Pasajero("Ana Gómez", "DEF65432"));
    }
}
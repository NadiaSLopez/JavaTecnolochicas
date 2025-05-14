import java.util.Scanner;

// 1. Crear la clase Vuelo
class Vuelo {
    final String codigoVuelo; // código único del vuelo
    String destino;           // ciudad destino del vuelo
    String horaSalida;        // hora de salida en formato 24h
    Pasajero asientoReservado; // referencia al pasajero que reservó el asiento (puede ser null)

    // Constructor del vuelo
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Inicialmente ningún asiento está reservado
    }

    /**
     * Asigna al pasajero al asiento si no hay reserva previa.
     * @param p El pasajero a reservar.
     * @return true si la reserva se realizó con éxito, false si ya hay una reserva.
     */
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("Asiento reservado para el pasajero: " + p.getNombre() + " en el vuelo " + codigoVuelo);
            return true;
        } else {
            System.out.println("El asiento para el vuelo " + codigoVuelo + " ya está reservado por: " + asientoReservado.getNombre());
            return false;
        }
    }

    /**
     * Asigna al pasajero al asiento si no hay reserva previa (método sobrecargado).
     * @param nombre Nombre del pasajero.
     * @param pasaporte Pasaporte del pasajero.
     * @return true si la reserva se realizó con éxito, false si ya hay una reserva.
     */
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    /**
     * Elimina al pasajero asignado al asiento.
     */
    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("Reserva cancelada para el pasajero: " + asientoReservado.getNombre() + " en el vuelo " + codigoVuelo);
            asientoReservado = null;
        } else {
            System.out.println("No hay ninguna reserva activa para el vuelo " + codigoVuelo);
        }
    }

    /**
     * Muestra la información del vuelo y el pasajero (si hay uno).
     * @return Una cadena con el itinerario.
     */
    public String obtenerItinerario() {
        StringBuilder itinerario = new StringBuilder();
        itinerario.append("--- Itinerario del Vuelo ").append(codigoVuelo).append(" ---\n");
        itinerario.append("Destino: ").append(destino).append("\n");
        itinerario.append("Hora de Salida: ").append(horaSalida).append("\n");
        if (asientoReservado != null) {
            itinerario.append("Pasajero Reservado:\n");
            itinerario.append("  Nombre: ").append(asientoReservado.getNombre()).append("\n");
            itinerario.append("  Pasaporte: ").append(asientoReservado.getPasaporte()).append("\n");
        } else {
            itinerario.append("Asiento: Libre\n");
        }
        return itinerario.toString();
    }
}
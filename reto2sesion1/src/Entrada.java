// Clase Entrada
class Entrada {
    // Atributos de la clase Entrada
    String nombreEvento;
    double precioEntrada;

    // Constructor que recibe el nombre del evento y el precio de la entrada
    public Entrada(String nombreEvento, double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    // Método público para mostrar la información de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}
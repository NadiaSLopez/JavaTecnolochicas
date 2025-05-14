// 2. Crear la clase Pasajero
class Pasajero {
    String nombre;     // nombre del pasajero
    String pasaporte; // número de pasaporte

    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }
}
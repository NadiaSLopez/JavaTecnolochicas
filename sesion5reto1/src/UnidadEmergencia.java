import java.util.Random;

// Clase abstracta UnidadEmergencia
abstract class UnidadEmergencia {
    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void responder();

    // Método concreto
    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }
}

// Clases auxiliares para composición
class SistemaGPS {
    public void localizar() {
        System.out.println("📍 GPS: Ubicación actual detectada.");
    }
}

class Sirena {
    public void activarSirena() {
        System.out.println("🔊 Sirena: Activada.");
    }
}

class Operador {
    String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse() {
        System.out.println("👷 Operador " + nombre + " reportándose.");
    }
}

// Subclases de UnidadEmergencia
class Ambulancia extends UnidadEmergencia {
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}

class Patrulla extends UnidadEmergencia {
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador;

    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}

class UnidadBomberos extends UnidadEmergencia {
    SistemaGPS gps = new SistemaGPS();
    Sirena sirena = new Sirena();
    Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}



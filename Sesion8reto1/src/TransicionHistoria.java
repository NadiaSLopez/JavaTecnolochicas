import java.util.Scanner;

// INTERFACES

interface TransicionHistoria {
    void transicionar(String escenaActual, String escenaSiguiente);
}

interface GestorDialogo {
    void mostrarDialogo(String personaje, String dialogo);
}

interface LogicaDecision {
    boolean tomarDecision();
}

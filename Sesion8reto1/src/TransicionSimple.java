import java.util.Scanner;

class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String escenaActual, String escenaSiguiente) {
        System.out.println("\nTransición: de '" + escenaActual + "' a '" + escenaSiguiente + "'...");
    }
}

class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String personaje, String dialogo) {
        System.out.println(personaje + ": \"" + dialogo + "\"");
    }
}

class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean tomarDecision() {
        System.out.println("\n¿Quieres entrar en la cueva? (s/n): ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("s");
    }
}
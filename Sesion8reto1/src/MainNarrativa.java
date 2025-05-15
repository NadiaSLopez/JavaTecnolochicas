
public class MainNarrativa {
    private TransicionHistoria transicion;
    private GestorDialogo dialogo;
    private LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarHistoria() {
        String escenaActual = "Bosque";
        dialogo.mostrarDialogo("Narrador", "Te encuentras en un oscuro bosque.");

        if (decision.tomarDecision()) {
            String nuevaEscena = "Cueva Misteriosa";
            transicion.transicionar(escenaActual, nuevaEscena);
            dialogo.mostrarDialogo("Narrador", "La cueva está fría y silenciosa.");
        } else {
            String nuevaEscena = "Sendero Seguro";
            transicion.transicionar(escenaActual, nuevaEscena);
            dialogo.mostrarDialogo("Narrador", "Decides seguir por el sendero iluminado por la luna.");
        }
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.iniciarHistoria();
    }
}
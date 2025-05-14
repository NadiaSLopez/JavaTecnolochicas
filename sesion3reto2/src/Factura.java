import java.util.Optional;
public class Factura {
    private double monto;         // cantidad total de la factura
    private String descripcion;   // breve concepto de lo facturado
    private Optional<String> rfc; // RFC del cliente (puede estar presente o no)

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); // Si rfc es null, se almacena como Optional.empty()
    }

    public String getResumen() {
        String resumen = "Factura generada:\n';" ;
        resumen += "Descripción:" + descripcion + '\n';
        resumen += "Monto: $" + monto + '\n';

        resumen += "RFC:" + rfc.orElse("[No proporcionado]") + '\n';

        return resumen;
    }
}
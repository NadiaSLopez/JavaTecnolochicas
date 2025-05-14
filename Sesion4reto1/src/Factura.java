class Factura {
    String folio;
    String cliente;
    double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Implementación del método toString()
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + String.format("%.2f", total) + "]";
    }

    // Implementación del método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Factura otraFactura = (Factura) obj;
        return folio != null && folio.equals(otraFactura.folio);
    }

    // Implementación del método hashCode() basado en el atributo folio
    @Override
    public int hashCode() {
        return folio != null ? folio.hashCode() : 0;
    }
}
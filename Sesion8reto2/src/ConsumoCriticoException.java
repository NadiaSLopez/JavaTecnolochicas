// EXCEPCIÓN PERSONALIZADA
class ConsumoCriticoException extends Exception {
  public ConsumoCriticoException(String mensaje) {
    super(mensaje);
  }
}
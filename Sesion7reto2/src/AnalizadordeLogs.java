import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadordeLogs {

    private static final String ARCHIVO_LOG = "errores.log";
    private static final String ARCHIVO_FALLOS = "registro_fallos.txt";

    public static void main(String[] args) {
        int totalLineas = 0;
        int contadorErrores = 0;
        int contadorAdvertencias = 0;

        Path pathArchivoLog = Paths.get(ARCHIVO_LOG);

        try (BufferedReader lector = Files.newBufferedReader(pathArchivoLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    contadorErrores++;
                } else if (linea.contains("WARNING")) {
                    contadorAdvertencias++;
                }
            }

            System.out.println("--- Resumen del Análisis de Logs ---");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + contadorErrores);
            System.out.println("Cantidad de advertencias: " + contadorAdvertencias);

            if (totalLineas > 0) {
                double porcentajeErrores = (double) contadorErrores / totalLineas * 100;
                double porcentajeAdvertencias = (double) contadorAdvertencias / totalLineas * 100;
                System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
                System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeAdvertencias);
            } else {
                System.out.println("El archivo de logs está vacío.");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo de logs: " + e.getMessage());
            guardarFallo(e.getMessage());
        }
    }

    private static void guardarFallo(String mensajeError) {
        Path pathArchivoFallos = Paths.get(ARCHIVO_FALLOS);
        try (BufferedWriter escritor = Files.newBufferedWriter(pathArchivoFallos)) {
            escritor.write("Error al procesar el archivo de logs: " + mensajeError);
            escritor.newLine();
        } catch (IOException ex) {
            System.err.println("Error al guardar el registro de fallos: " + ex.getMessage());
        }
    }

    // Método auxiliar para generar un archivo de logs de prueba (opcional)
    public static void generarArchivoLogDePrueba() {
        Path pathArchivoLog = Paths.get(ARCHIVO_LOG);
        try (BufferedWriter escritor = Files.newBufferedWriter(pathArchivoLog)) {
            escritor.write("INFO: Sistema iniciado correctamente.");
            escritor.newLine();
            escritor.write("WARNING: Posible cuello de botella en la base de datos.");
            escritor.newLine();
            escritor.write("INFO: Prueba de usuario 'admin' exitosa.");
            escritor.newLine();
            escritor.write("ERROR: Fallo al conectar con el servicio externo.");
            escritor.newLine();
            escritor.write("WARNING: Uso elevado de memoria.");
            escritor.newLine();
            escritor.write("INFO: Todas las pruebas completadas.");
            escritor.newLine();
            escritor.write("ERROR: Error de validación en el formulario.");
            escritor.newLine();
        } catch (IOException e) {
            System.err.println("Error al generar el archivo de logs de prueba: " + e.getMessage());
        }
    }
}
package laboratorio_collections.punto14;

/*
 * PUNTO 14 - HISTORIAL DE MENSAJES
 *
 * Enunciado:
 * En una aplicación de mensajería, se requiere un historial de los últimos mensajes
 * enviados. Para lograrlo, se utilizará un ArrayDeque, que permitirá agregar nuevos
 * mensajes al final de la estructura y recuperar los últimos diez mensajes enviados
 * de manera rápida y eficiente.
 */
public class App {

    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        for (int i = 1; i <= 12; i++) {
            historial.agregarMensaje("Mensaje " + i);
        }

        System.out.println("Últimos 10 mensajes:");
        for (String mensaje : historial.obtenerUltimosDiez()) {
            System.out.println(mensaje);
        }
    }
}

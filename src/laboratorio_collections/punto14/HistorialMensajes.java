package laboratorio_collections.punto14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Guarda mensajes y permite consultar los últimos diez enviados.
 */
public class HistorialMensajes {

    private final ArrayDeque<String> mensajes;

    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }

    public void agregarMensaje(String mensaje) {
        mensajes.addLast(mensaje);
    }

    public List<String> obtenerUltimosDiez() {
        List<String> ultimos = new ArrayList<>();
        Iterator<String> iterator = mensajes.descendingIterator();
        int contador = 0;

        while (iterator.hasNext() && contador < 10) {
            ultimos.add(0, iterator.next());
            contador++;
        }

        return ultimos;
    }
}

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

    /**
     * Agrega un mensaje al final del historial.
     *
     * @param mensaje texto que se desea guardar
     */
    public void agregarMensaje(String mensaje) {
        mensajes.addLast(mensaje);
    }

    /**
     * Recorre el deque desde el final para tomar como máximo los diez mensajes
     * más recientes. Se insertan al inicio de la lista resultado para conservar
     * el orden en que fueron enviados.
     *
     * @return lista con los últimos diez mensajes, o menos si no existen diez
     */
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

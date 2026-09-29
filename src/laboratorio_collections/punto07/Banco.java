package laboratorio_collections.punto07;

import java.util.LinkedList;

/**
 * Gestiona los turnos de los clientes de un banco.
 */
public class Banco {

    private final LinkedList<String> turnos;

    public Banco() {
        turnos = new LinkedList<>();
    }

    /**
     * Agrega un cliente al final de la cola de espera.
     *
     * @param cliente nombre del cliente que toma el turno
     */
    public void agregarCliente(String cliente) {
        turnos.addLast(cliente);
    }

    /**
     * Agrega un cliente urgente al comienzo de la cola para que sea atendido primero.
     *
     * @param cliente nombre del cliente con prioridad
     */
    public void agregarClienteUrgente(String cliente) {
        turnos.addFirst(cliente);
    }

    /**
     * Retira y devuelve al primer cliente de la cola.
     * Si no hay turnos pendientes, devuelve un mensaje informándolo.
     *
     * @return cliente atendido o mensaje cuando la cola está vacía
     */
    public String atenderCliente() {
        if (turnos.isEmpty()) {
            return "No hay clientes en espera";
        }
        return turnos.removeFirst();
    }

    /**
     * Recorre la cola y muestra los clientes que siguen esperando su turno.
     */
    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay clientes en espera");
            return;
        }

        for (String cliente : turnos) {
            System.out.println(cliente);
        }
    }
}

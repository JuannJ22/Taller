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

    /** Agrega un cliente al final de la cola. */
    public void agregarCliente(String cliente) {
        turnos.addLast(cliente);
    }

    /** Agrega un cliente urgente al inicio de la cola. */
    public void agregarClienteUrgente(String cliente) {
        turnos.addFirst(cliente);
    }

    /** Atiende y retira al primer cliente de la cola. */
    public String atenderCliente() {
        if (turnos.isEmpty()) {
            return "No hay clientes en espera";
        }
        return turnos.removeFirst();
    }

    /** Muestra los turnos pendientes. */
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

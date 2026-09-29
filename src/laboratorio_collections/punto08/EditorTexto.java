package laboratorio_collections.punto08;

import java.util.Vector;

/**
 * Guarda el historial de cambios realizados en un editor de texto.
 */
public class EditorTexto {

    private final Vector<String> cambios;

    public EditorTexto() {
        cambios = new Vector<>();
    }

    /**
     * Guarda un nuevo cambio al final del historial.
     *
     * @param cambio descripción del cambio realizado
     */
    public void registrarCambio(String cambio) {
        cambios.add(cambio);
    }

    /**
     * Elimina el último cambio realizado, simulando la opción de deshacer.
     *
     * @return cambio eliminado o un mensaje si no hay cambios registrados
     */
    public String deshacer() {
        if (cambios.isEmpty()) {
            return "No hay cambios para deshacer";
        }
        return cambios.remove(cambios.size() - 1);
    }

    /**
     * Muestra los cambios que todavía permanecen guardados en el historial.
     */
    public void mostrarHistorial() {
        if (cambios.isEmpty()) {
            System.out.println("No hay cambios registrados");
            return;
        }

        for (String cambio : cambios) {
            System.out.println(cambio);
        }
    }
}

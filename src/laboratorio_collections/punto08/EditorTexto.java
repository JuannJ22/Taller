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

    public void registrarCambio(String cambio) {
        cambios.add(cambio);
    }

    public String deshacer() {
        if (cambios.isEmpty()) {
            return "No hay cambios para deshacer";
        }
        return cambios.remove(cambios.size() - 1);
    }

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

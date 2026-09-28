package laboratorio_collections.punto11;

import java.util.LinkedHashSet;

/**
 * Guarda canciones favoritas sin repetirlas y conserva el orden de inserción.
 */
public class CancionesFavoritas {

    private final LinkedHashSet<String> canciones;

    public CancionesFavoritas() {
        canciones = new LinkedHashSet<>();
    }

    public boolean agregarCancion(String cancion) {
        return canciones.add(cancion);
    }

    public void mostrarCanciones() {
        for (String cancion : canciones) {
            System.out.println(cancion);
        }
    }
}

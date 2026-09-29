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

    /**
     * Agrega una canción a favoritos. Si ya existe, LinkedHashSet no la repite.
     *
     * @param cancion nombre de la canción
     * @return true si se agregó y false si ya estaba guardada
     */
    public boolean agregarCancion(String cancion) {
        return canciones.add(cancion);
    }

    /**
     * Muestra las canciones en el mismo orden en que fueron agregadas.
     */
    public void mostrarCanciones() {
        for (String cancion : canciones) {
            System.out.println(cancion);
        }
    }
}

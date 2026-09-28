package laboratorio_generics.punto05_registro_asistentes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Administra una lista de asistentes.
 */
public class RegistroAsistentes {

    private final LinkedList<Asistente> asistentes;

    public RegistroAsistentes() {
        asistentes = new LinkedList<>();
    }

    public void agregarAsistente(Asistente asistente) {
        asistentes.add(asistente);
    }

    /** Filtra por la letra inicial del nombre usando únicamente Iterator. */
    public List<Asistente> filtrarPorLetra(char letra) {
        List<Asistente> resultado = new ArrayList<>();
        Iterator<Asistente> iterator = asistentes.iterator();
        char letraBuscada = Character.toLowerCase(letra);

        while (iterator.hasNext()) {
            Asistente asistente = iterator.next();
            String nombre = asistente.getNombre();

            if (!nombre.isEmpty() && Character.toLowerCase(nombre.charAt(0)) == letraBuscada) {
                resultado.add(asistente);
            }
        }

        return resultado;
    }

    public void ordenarPorNombre() {
        Comparator<Asistente> comparadorNombre = new Comparator<Asistente>() {
            @Override
            public int compare(Asistente asistente1, Asistente asistente2) {
                return asistente1.getNombre().compareToIgnoreCase(asistente2.getNombre());
            }
        };

        asistentes.sort(comparadorNombre);
    }

    public void mostrarAsistentes() {
        for (Asistente asistente : asistentes) {
            System.out.println(asistente);
        }
    }
}

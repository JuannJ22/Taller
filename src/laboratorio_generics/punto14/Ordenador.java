package laboratorio_generics.punto14;

import java.util.List;

/**
 * Ordena listas de elementos comparables utilizando compareTo.
 */
public class Ordenador<T extends Comparable<T>> {

    /**
     * Ordena la lista de menor a mayor con un ordenamiento burbuja. En cada pasada
     * compara dos elementos vecinos con compareTo y los intercambia si están al revés.
     *
     * @param lista lista que se desea ordenar
     */
    public void ordenar(List<T> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                T actual = lista.get(j);
                T siguiente = lista.get(j + 1);

                if (actual.compareTo(siguiente) > 0) {
                    lista.set(j, siguiente);
                    lista.set(j + 1, actual);
                }
            }
        }
    }
}

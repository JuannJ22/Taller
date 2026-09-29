package laboratorio_generics.punto08;

/**
 * Compara elementos que implementan Comparable.
 */
public class Comparador<T extends Comparable<T>> {

    /**
     * Compara dos elementos usando compareTo y devuelve el mayor de los dos.
     *
     * @param a primer elemento
     * @param b segundo elemento
     * @return elemento mayor según su orden natural
     */
    public T mayor(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}

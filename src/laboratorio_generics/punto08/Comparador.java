package laboratorio_generics.punto08;

/**
 * Compara elementos que implementan Comparable.
 */
public class Comparador<T extends Comparable<T>> {

    public T mayor(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}

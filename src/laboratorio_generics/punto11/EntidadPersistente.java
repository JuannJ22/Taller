package laboratorio_generics.punto11;

/**
 * Almacena un valor numérico comparable y permite compararlo con otro del mismo tipo.
 */
public class EntidadPersistente<T extends Number & Comparable<T>> {

    private final T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    /**
     * Compara el valor almacenado con otro valor del mismo tipo usando compareTo.
     *
     * @param otro valor con el que se quiere comparar
     * @return negativo si es menor, cero si son iguales o positivo si es mayor
     */
    public int compararCon(T otro) {
        return valor.compareTo(otro);
    }

    public T getValor() {
        return valor;
    }
}

package laboratorio_generics.punto05_par;

/**
 * Guarda dos valores del mismo tipo y permite compararlos.
 */
public class Par<T> {

    private final T valor1;
    private final T valor2;

    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public boolean sonIguales() {
        if (valor1 == null) {
            return valor2 == null;
        }
        return valor1.equals(valor2);
    }
}

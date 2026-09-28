package laboratorio_generics.punto06;

/**
 * Almacena un valor numérico y permite obtener su doble.
 */
public class CajaNumerica<T extends Number> {

    private final T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    public double doble() {
        return numero.doubleValue() * 2;
    }
}

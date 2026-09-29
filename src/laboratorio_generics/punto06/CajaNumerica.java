package laboratorio_generics.punto06;

/**
 * Almacena un valor numérico y permite obtener su doble.
 */
public class CajaNumerica<T extends Number> {

    private final T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    /**
     * Convierte el número almacenado a double y multiplica su valor por dos.
     *
     * @return doble del número guardado
     */
    public double doble() {
        return numero.doubleValue() * 2;
    }
}

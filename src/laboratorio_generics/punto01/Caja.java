package laboratorio_generics.punto01;

/**
 * Almacena un valor de cualquier tipo T.
 */
public class Caja<T> {

    private T contenido;

    public void guardar(T valor) {
        contenido = valor;
    }

    public T obtener() {
        return contenido;
    }
}

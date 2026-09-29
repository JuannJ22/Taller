package laboratorio_generics.punto01;

/**
 * Almacena un valor de cualquier tipo T.
 */
public class Caja<T> {

    private T contenido;

    /**
     * Guarda un valor dentro de la caja. El tipo depende del T usado al crearla.
     *
     * @param valor elemento que se quiere guardar
     */
    public void guardar(T valor) {
        contenido = valor;
    }

    /**
     * Devuelve el valor que se encuentra guardado en la caja.
     *
     * @return contenido actual de la caja
     */
    public T obtener() {
        return contenido;
    }
}

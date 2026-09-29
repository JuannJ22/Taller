package laboratorio_generics.punto02;

/*
 * PUNTO 2 - MÉTODO GENÉRICO mostrarElemento
 *
 * Enunciado:
 * Crear un método estático genérico que reciba un parámetro de tipo T y lo imprima
 * en consola.
 */
public class App {

    /**
     * Recibe cualquier tipo de dato y lo muestra en consola. El tipo T se determina
     * según el valor que se envíe al llamar el método.
     *
     * @param elemento elemento que se desea mostrar
     * @param <T> tipo del elemento recibido
     */
    public static <T> void mostrarElemento(T elemento) {
        System.out.println(elemento);
    }

    public static void main(String[] args) {
        mostrarElemento("Hola");
        mostrarElemento(25);
        mostrarElemento(3.14);
    }
}

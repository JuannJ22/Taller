package laboratorio_generics.punto02;

/*
 * PUNTO 2 - MÉTODO GENÉRICO mostrarElemento
 *
 * Enunciado:
 * Crear un método estático genérico que reciba un parámetro de tipo T y lo imprima
 * en consola.
 */
public class App {

    public static <T> void mostrarElemento(T elemento) {
        System.out.println(elemento);
    }

    public static void main(String[] args) {
        mostrarElemento("Hola");
        mostrarElemento(25);
        mostrarElemento(3.14);
    }
}

package laboratorio_generics.punto08;

/*
 * PUNTO 8 - CLASE Comparador<T extends Comparable<T>>
 *
 * Enunciado:
 * Crear una clase genérica con un método mayor(T a, T b) que devuelva el mayor
 * entre dos elementos comparables.
 */
public class App {

    public static void main(String[] args) {
        Comparador<Integer> comparadorNumeros = new Comparador<>();
        Comparador<String> comparadorTextos = new Comparador<>();

        System.out.println("Mayor entre 10 y 25: " + comparadorNumeros.mayor(10, 25));
        System.out.println("Mayor entre Ana y Sofía: " + comparadorTextos.mayor("Ana", "Sofía"));
    }
}

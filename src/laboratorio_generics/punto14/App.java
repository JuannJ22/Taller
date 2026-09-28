package laboratorio_generics.punto14;

import java.util.ArrayList;
import java.util.List;

/*
 * PUNTO 14 - Ordenador<T extends Comparable<T>>
 *
 * Enunciado:
 * Implementar un método ordenar(List<T> lista) que ordene una lista usando
 * el método compareTo.
 */
public class App {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
        numeros.add(1);
        numeros.add(6);

        System.out.println("Antes: " + numeros);

        Ordenador<Integer> ordenador = new Ordenador<>();
        ordenador.ordenar(numeros);

        System.out.println("Después: " + numeros);
    }
}

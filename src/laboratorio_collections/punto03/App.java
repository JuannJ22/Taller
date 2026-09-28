package laboratorio_collections.punto03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * PUNTO 3 - LISTA SIN DUPLICADOS CON ITERADORES
 *
 * Enunciado:
 * Crear una lista de elementos que no permite duplicados e imprima el contenido
 * de la lista usando iteradores.
 */
public class App {

    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();

        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Andrés");
        nombres.add("Carlos");

        System.out.println("Elementos de la lista sin duplicados:");
        Iterator<String> iterator = nombres.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

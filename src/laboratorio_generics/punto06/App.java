package laboratorio_generics.punto06;

/*
 * PUNTO 6 - CajaNumerica<T extends Number>
 *
 * Enunciado:
 * Crear una clase genérica que almacene un número y tenga un método doble()
 * que devuelva el doble de su valor.
 */
public class App {

    public static void main(String[] args) {
        CajaNumerica<Integer> entero = new CajaNumerica<>(10);
        CajaNumerica<Double> decimal = new CajaNumerica<>(4.5);

        System.out.println("Doble de 10: " + entero.doble());
        System.out.println("Doble de 4.5: " + decimal.doble());
    }
}

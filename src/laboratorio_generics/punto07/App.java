package laboratorio_generics.punto07;

/*
 * PUNTO 7 - MÉTODO GENÉRICO sumar
 *
 * Enunciado:
 * Implementar un método que reciba dos parámetros de tipo T y devuelva la suma
 * como double.
 */
public class App {

    /**
     * Suma dos valores numéricos. La restricción Number permite usar doubleValue()
     * sin importar si llegan Integer, Double u otro tipo numérico.
     *
     * @param a primer número
     * @param b segundo número
     * @param <T> tipo numérico recibido
     * @return suma de ambos valores como double
     */
    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Suma de enteros: " + sumar(10, 20));
        System.out.println("Suma de decimales: " + sumar(5.5, 2.3));
    }
}

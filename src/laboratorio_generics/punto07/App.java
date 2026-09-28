package laboratorio_generics.punto07;

/*
 * PUNTO 7 - MÉTODO GENÉRICO sumar
 *
 * Enunciado:
 * Implementar un método que reciba dos parámetros de tipo T y devuelva la suma
 * como double.
 */
public class App {

    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Suma de enteros: " + sumar(10, 20));
        System.out.println("Suma de decimales: " + sumar(5.5, 2.3));
    }
}

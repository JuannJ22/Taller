package laboratorio_generics.punto05_par;

/*
 * PUNTO 5 - CLASE Par<T>
 *
 * Enunciado:
 * Implementar una clase que guarde dos valores de tipo T y un método para verificar
 * si ambos son iguales.
 */
public class App {

    public static void main(String[] args) {
        Par<Integer> par1 = new Par<>(10, 10);
        Par<String> par2 = new Par<>("Hola", "Mundo");

        System.out.println("¿Los valores del primer par son iguales? " + par1.sonIguales());
        System.out.println("¿Los valores del segundo par son iguales? " + par2.sonIguales());
    }
}

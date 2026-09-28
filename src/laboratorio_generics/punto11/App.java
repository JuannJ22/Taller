package laboratorio_generics.punto11;

/*
 * PUNTO 11 - EntidadPersistente<T extends Number & Comparable<T>>
 *
 * Enunciado:
 * Crear una clase que almacene un valor T y permita compararlo con otros objetos
 * del mismo tipo.
 */
public class App {

    public static void main(String[] args) {
        EntidadPersistente<Integer> entidad = new EntidadPersistente<>(20);
        int resultado = entidad.compararCon(15);

        System.out.println("Valor almacenado: " + entidad.getValor());
        System.out.println("Resultado de comparar con 15: " + resultado);
    }
}

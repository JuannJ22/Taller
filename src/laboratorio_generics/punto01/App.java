package laboratorio_generics.punto01;

/*
 * PUNTO 1 - CLASE GENÉRICA Caja<T>
 *
 * Enunciado:
 * Implementar una clase con un atributo T contenido y métodos guardar(T valor)
 * y obtener().
 */
public class App {

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);

        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de número: " + cajaNumero.obtener());
    }
}

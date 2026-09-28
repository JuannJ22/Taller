package laboratorio_collections.punto09;

/*
 * PUNTO 9 - NAVEGACIÓN WEB
 *
 * Enunciado:
 * En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores.
 * Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In,
 * First Out). Cada vez que el usuario visite una nueva página, esta se añadirá a la pila,
 * y cuando decida volver atrás, se eliminará la última página visitada para regresar a
 * la anterior.
 */
public class App {

    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();

        navegador.visitarPagina("google.com");
        navegador.visitarPagina("wikipedia.org");
        navegador.visitarPagina("github.com");

        System.out.println("Página actual: " + navegador.paginaActual());
        System.out.println("Al volver atrás: " + navegador.volverAtras());
        System.out.println("Página actual: " + navegador.paginaActual());

        System.out.print("Historial: ");
        navegador.mostrarHistorial();
    }
}

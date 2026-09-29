package laboratorio_collections.punto09;

import java.util.Stack;

/**
 * Simula un historial sencillo de navegación web usando una pila.
 */
public class NavegadorWeb {

    private final Stack<String> historial;

    public NavegadorWeb() {
        historial = new Stack<>();
    }

    /**
     * Guarda una nueva página en la parte superior de la pila.
     *
     * @param pagina dirección o nombre de la página visitada
     */
    public void visitarPagina(String pagina) {
        historial.push(pagina);
    }

    /**
     * Consulta la página que está actualmente en la parte superior de la pila.
     *
     * @return página actual o un mensaje si no hay ninguna abierta
     */
    public String paginaActual() {
        if (historial.isEmpty()) {
            return "No hay una página abierta";
        }
        return historial.peek();
    }

    /**
     * Quita la página actual para regresar a la página visitada anteriormente.
     *
     * @return página anterior o un mensaje si no se puede retroceder
     */
    public String volverAtras() {
        if (historial.size() <= 1) {
            return "No hay una página anterior";
        }

        historial.pop();
        return historial.peek();
    }

    public void mostrarHistorial() {
        System.out.println(historial);
    }
}

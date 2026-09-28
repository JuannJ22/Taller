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

    public void visitarPagina(String pagina) {
        historial.push(pagina);
    }

    public String paginaActual() {
        if (historial.isEmpty()) {
            return "No hay una página abierta";
        }
        return historial.peek();
    }

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

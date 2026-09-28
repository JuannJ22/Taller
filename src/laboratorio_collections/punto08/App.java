package laboratorio_collections.punto08;

/*
 * PUNTO 8 - DESHACER EN EL EDITOR
 *
 * Enunciado:
 * Un editor de texto necesita registrar los cambios recientes para que el usuario pueda
 * deshacerlos cuando sea necesario. Para este caso, se utilizará un Vector, ya que
 * permite almacenar los cambios de forma segura en entornos concurrentes. Se deberá
 * implementar una función de "deshacer" que elimine el último cambio realizado,
 * asegurando que se mantenga un historial de modificaciones.
 */
public class App {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.registrarCambio("Escribió Hola");
        editor.registrarCambio("Escribió Mundo");
        editor.registrarCambio("Cambió el título");

        System.out.println("Historial actual:");
        editor.mostrarHistorial();

        System.out.println("\nCambio deshecho: " + editor.deshacer());

        System.out.println("\nHistorial después de deshacer:");
        editor.mostrarHistorial();
    }
}

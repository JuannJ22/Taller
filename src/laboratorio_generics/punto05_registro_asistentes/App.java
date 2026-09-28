package laboratorio_generics.punto05_registro_asistentes;

import java.util.List;

/*
 * PUNTO 5 - REGISTRO DE ASISTENTES
 *
 * Enunciado:
 * Crear Asistente (documento, nombre) con orden natural por documento.
 * RegistroAsistentes guarda una LinkedList<Asistente> y ofrece:
 * - Método que filtre asistentes cuyo nombre comience por una letra dada usando solo Iterator.
 * - Método que ordene por nombre con Comparator.
 */
public class App {

    public static void main(String[] args) {
        RegistroAsistentes registro = new RegistroAsistentes();

        registro.agregarAsistente(new Asistente("1030", "Sofía"));
        registro.agregarAsistente(new Asistente("1010", "Carlos"));
        registro.agregarAsistente(new Asistente("1020", "Samuel"));
        registro.agregarAsistente(new Asistente("1040", "María"));

        System.out.println("Asistentes cuyo nombre comienza por S:");
        List<Asistente> filtrados = registro.filtrarPorLetra('S');
        for (Asistente asistente : filtrados) {
            System.out.println(asistente);
        }

        registro.ordenarPorNombre();
        System.out.println("\nAsistentes ordenados por nombre:");
        registro.mostrarAsistentes();
    }
}

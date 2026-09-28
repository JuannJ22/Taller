package laboratorio_collections.punto15;

/*
 * PUNTO 15 - DIRECTORIO TELEFÓNICO
 *
 * Enunciado:
 * Un directorio telefónico necesita almacenar nombres junto con sus respectivos
 * números de teléfono y permitir búsquedas eficientes. Para este caso, se usará un
 * HashMap, el cual asociará cada nombre con su número telefónico, posibilitando
 * consultas rápidas y evitando duplicados.
 */
public class App {

    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        directorio.agregarContacto("Carlos", "3001234567");
        directorio.agregarContacto("María", "3117654321");
        directorio.agregarContacto("Sofía", "3201112233");

        System.out.println("Teléfono de María: " + directorio.buscarTelefono("María"));
        System.out.println("Teléfono de Andrés: " + directorio.buscarTelefono("Andrés"));

        System.out.println("\nDirectorio:");
        directorio.mostrarContactos();
    }
}

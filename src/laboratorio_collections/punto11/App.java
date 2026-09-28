package laboratorio_collections.punto11;

/*
 * PUNTO 11 - CANCIONES FAVORITAS
 *
 * Enunciado:
 * En una aplicación de música, los usuarios pueden marcar canciones como favoritas.
 * Para garantizar que las canciones favoritas se mantengan en el orden en que fueron
 * añadidas sin permitir duplicados, se empleará un LinkedHashSet, el cual conservará
 * la secuencia de inserción y asegurará que no haya repeticiones.
 */
public class App {

    public static void main(String[] args) {
        CancionesFavoritas favoritas = new CancionesFavoritas();

        favoritas.agregarCancion("Yellow");
        favoritas.agregarCancion("Viva la Vida");
        favoritas.agregarCancion("Fix You");
        favoritas.agregarCancion("Yellow");

        System.out.println("Canciones favoritas:");
        favoritas.mostrarCanciones();
    }
}

package laboratorio_collections.punto12;

/*
 * PUNTO 12 - ESTUDIANTES ORDENADOS
 *
 * Enunciado:
 * En una universidad, los nombres de los estudiantes deben mantenerse ordenados
 * alfabéticamente para facilitar su búsqueda. Para ello, se utilizará un TreeSet, que
 * automáticamente organizará los nombres de los estudiantes a medida que se agregan
 * y permitirá obtener fácilmente el primer y el último nombre de la lista.
 */
public class App {

    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        registro.agregarEstudiante("Sofía");
        registro.agregarEstudiante("Carlos");
        registro.agregarEstudiante("Andrés");
        registro.agregarEstudiante("María");

        System.out.println("Estudiantes ordenados:");
        registro.mostrarEstudiantes();

        System.out.println("\nPrimer estudiante: " + registro.primerEstudiante());
        System.out.println("Último estudiante: " + registro.ultimoEstudiante());
    }
}

package laboratorio_collections.punto12;

import java.util.TreeSet;

/**
 * Mantiene los nombres de los estudiantes ordenados alfabéticamente.
 */
public class RegistroEstudiantes {

    private final TreeSet<String> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new TreeSet<>();
    }

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public String primerEstudiante() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados";
        }
        return estudiantes.first();
    }

    public String ultimoEstudiante() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados";
        }
        return estudiantes.last();
    }

    public void mostrarEstudiantes() {
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}

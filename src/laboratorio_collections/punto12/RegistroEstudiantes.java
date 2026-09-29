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

    /**
     * Agrega un estudiante. TreeSet se encarga de mantener el orden alfabético.
     *
     * @param nombre nombre del estudiante
     */
    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    /**
     * Obtiene el primer nombre según el orden natural del TreeSet.
     *
     * @return primer estudiante o un mensaje si no hay registros
     */
    public String primerEstudiante() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados";
        }
        return estudiantes.first();
    }

    /**
     * Obtiene el último nombre según el orden natural del TreeSet.
     *
     * @return último estudiante o un mensaje si no hay registros
     */
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

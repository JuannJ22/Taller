package laboratorio_generics.punto03_catalogo_cursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Administra un catálogo de cursos.
 */
public class CatalogoCursos {

    private final ArrayList<Curso> cursos;

    public CatalogoCursos() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    /**
     * Busca los cursos que pertenecen al año indicado. El recorrido se hace con
     * Iterator, como lo pide el ejercicio, y los encontrados se guardan aparte.
     *
     * @param anioBuscado año que se quiere consultar
     * @return lista con los cursos encontrados en ese año
     */
    public List<Curso> buscarPorAnio(int anioBuscado) {
        List<Curso> resultado = new ArrayList<>();
        Iterator<Curso> iterator = cursos.iterator();

        while (iterator.hasNext()) {
            Curso curso = iterator.next();

            if (curso.getAnio() == anioBuscado) {
                resultado.add(curso);
            }
        }

        return resultado;
    }

    /**
     * Ordena el catálogo usando el código de cada curso como criterio.
     * El Comparator permite tener este orden sin cambiar la clase Curso.
     */
    public void ordenarPorCodigo() {
        Comparator<Curso> comparadorCodigo = new Comparator<Curso>() {
            @Override
            public int compare(Curso curso1, Curso curso2) {
                return curso1.getCodigo().compareTo(curso2.getCodigo());
            }
        };

        cursos.sort(comparadorCodigo);
    }

    public void mostrarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
}

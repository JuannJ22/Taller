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

    /** Busca cursos de un año utilizando únicamente Iterator. */
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

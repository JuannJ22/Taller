package laboratorio_generics.punto03_catalogo_cursos;

import java.util.List;

/*
 * PUNTO 3 - CATÁLOGO DE CURSOS
 *
 * Enunciado:
 * Definir Curso (código, nombre, año). Implementar CatálogoCursos con
 * ArrayList<Curso>. Añadir un método que retorne todos los cursos de un año objetivo
 * recorriendo solo con Iterator. Luego, otro método que ordene por código con Comparator.
 */
public class App {

    public static void main(String[] args) {
        CatalogoCursos catalogo = new CatalogoCursos();

        catalogo.agregarCurso(new Curso("C003", "Estructura de Datos", 2026));
        catalogo.agregarCurso(new Curso("C001", "Programación", 2025));
        catalogo.agregarCurso(new Curso("C002", "Bases de Datos", 2026));

        System.out.println("Cursos del año 2026:");
        List<Curso> cursos2026 = catalogo.buscarPorAnio(2026);
        for (Curso curso : cursos2026) {
            System.out.println(curso);
        }

        catalogo.ordenarPorCodigo();
        System.out.println("\nCursos ordenados por código:");
        catalogo.mostrarCursos();
    }
}

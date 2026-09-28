package laboratorio_generics.punto03_catalogo_cursos;

/**
 * Representa un curso con código, nombre y año.
 */
public class Curso {

    private final String codigo;
    private final String nombre;
    private final int anio;

    public Curso(String codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + anio;
    }
}

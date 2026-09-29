package laboratorio_generics.punto05_registro_asistentes;

/**
 * Representa un asistente identificado por documento y nombre.
 */
public class Asistente implements Comparable<Asistente> {

    private final String documento;
    private final String nombre;

    public Asistente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Define el orden natural de los asistentes usando el número de documento.
     *
     * @param otro asistente con el que se hace la comparación
     * @return valor negativo, cero o positivo según el resultado de la comparación
     */
    @Override
    public int compareTo(Asistente otro) {
        return this.documento.compareTo(otro.documento);
    }

    @Override
    public String toString() {
        return documento + " - " + nombre;
    }
}

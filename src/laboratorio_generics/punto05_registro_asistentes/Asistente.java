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

    @Override
    public int compareTo(Asistente otro) {
        return this.documento.compareTo(otro.documento);
    }

    @Override
    public String toString() {
        return documento + " - " + nombre;
    }
}

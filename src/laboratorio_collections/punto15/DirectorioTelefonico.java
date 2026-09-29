package laboratorio_collections.punto15;

import java.util.HashMap;
import java.util.Map;

/**
 * Asocia nombres de contactos con sus números telefónicos.
 */
public class DirectorioTelefonico {

    private final HashMap<String, String> contactos;

    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }

    /**
     * Agrega un contacto solamente si el nombre todavía no está registrado.
     *
     * @param nombre nombre que se usará como clave
     * @param telefono número telefónico asociado
     * @return true si el contacto fue agregado y false si el nombre ya existía
     */
    public boolean agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            return false;
        }

        contactos.put(nombre, telefono);
        return true;
    }

    /**
     * Busca el teléfono asociado a un nombre dentro del HashMap.
     *
     * @param nombre contacto que se desea buscar
     * @return número guardado o un mensaje si el contacto no existe
     */
    public String buscarTelefono(String nombre) {
        String telefono = contactos.get(nombre);
        if (telefono == null) {
            return "Contacto no encontrado";
        }
        return telefono;
    }

    public void mostrarContactos() {
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println(contacto.getKey() + ": " + contacto.getValue());
        }
    }
}

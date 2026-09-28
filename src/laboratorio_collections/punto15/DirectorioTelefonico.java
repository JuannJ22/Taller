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

    public boolean agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            return false;
        }

        contactos.put(nombre, telefono);
        return true;
    }

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

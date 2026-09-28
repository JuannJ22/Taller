package laboratorio_collections.punto10;

import java.util.HashSet;

/**
 * Registra los códigos autorizados para ingresar a un edificio.
 */
public class ControlAcceso {

    private final HashSet<String> empleados;

    public ControlAcceso() {
        empleados = new HashSet<>();
    }

    public boolean registrarEmpleado(String id) {
        return empleados.add(id);
    }

    public boolean tieneAcceso(String id) {
        return empleados.contains(id);
    }

    public void mostrarEmpleados() {
        for (String id : empleados) {
            System.out.println(id);
        }
    }
}

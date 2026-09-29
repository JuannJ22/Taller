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

    /**
     * Registra el identificador de un empleado. HashSet evita que el mismo código
     * quede guardado más de una vez.
     *
     * @param id código del empleado
     * @return true si se agregó y false si ya estaba registrado
     */
    public boolean registrarEmpleado(String id) {
        return empleados.add(id);
    }

    /**
     * Comprueba si un código se encuentra dentro de los empleados autorizados.
     *
     * @param id código que se desea consultar
     * @return true si el empleado está registrado
     */
    public boolean tieneAcceso(String id) {
        return empleados.contains(id);
    }

    public void mostrarEmpleados() {
        for (String id : empleados) {
            System.out.println(id);
        }
    }
}

package laboratorio_collections.punto10;

/*
 * PUNTO 10 - CONTROL DE ACCESO
 *
 * Enunciado:
 * En un edificio con control de acceso, los empleados deben identificarse mediante un
 * código único para poder ingresar. Para gestionar estos accesos sin permitir
 * duplicados, se utilizará un HashSet, donde cada ID de empleado será almacenado y
 * verificado antes de permitir la entrada.
 */
public class App {

    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();

        control.registrarEmpleado("EMP001");
        control.registrarEmpleado("EMP002");
        control.registrarEmpleado("EMP003");

        boolean repetido = control.registrarEmpleado("EMP001");

        System.out.println("¿Se agregó nuevamente EMP001? " + repetido);
        System.out.println("¿EMP002 tiene acceso? " + control.tieneAcceso("EMP002"));
        System.out.println("¿EMP010 tiene acceso? " + control.tieneAcceso("EMP010"));

        System.out.println("\nEmpleados registrados:");
        control.mostrarEmpleados();
    }
}

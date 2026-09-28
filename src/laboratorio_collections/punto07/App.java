package laboratorio_collections.punto07;

/*
 * PUNTO 7 - TURNOS DEL BANCO
 *
 * Enunciado:
 * En un banco, el sistema de atención al cliente debe manejar los turnos de manera
 * ordenada. Para lograrlo, se empleará una LinkedList (String), la cual permitirá
 * agregar clientes en la cola de espera, atender al primero en la lista y ofrecer
 * una funcionalidad especial para insertar clientes con urgencia al inicio de la
 * cola sin afectar el rendimiento.
 */
public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente("Carlos");
        banco.agregarCliente("María");
        banco.agregarCliente("Andrés");
        banco.agregarClienteUrgente("Sofía");

        System.out.println("--- TURNOS DEL BANCO ---");
        System.out.println("Turnos actuales:");
        banco.mostrarTurnos();

        System.out.println("\nCliente atendido: " + banco.atenderCliente());

        System.out.println("\nTurnos restantes:");
        banco.mostrarTurnos();
    }
}

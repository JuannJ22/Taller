package laboratorio_collections.punto16;

/*
 * PUNTO 16 - SUPERMERCADO
 *
 * Enunciado:
 * En un supermercado, se desea registrar los productos comprados en el orden en
 * que fueron escaneados y calcular el total de la compra. Para lograr esto, se
 * empleará un LinkedHashMap, asegurando que los productos y sus precios se
 * almacenen en el mismo orden en que se añadieron, facilitando el procesamiento de
 * la factura final.
 */
public class App {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        supermercado.registrarProducto("Leche", 4800);
        supermercado.registrarProducto("Pan", 3500);
        supermercado.registrarProducto("Huevos", 12500);

        System.out.println("Productos comprados:");
        supermercado.mostrarCompra();
        System.out.printf("Total: $%.2f%n", supermercado.calcularTotal());
    }
}

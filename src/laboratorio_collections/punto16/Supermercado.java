package laboratorio_collections.punto16;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Registra productos en el orden de escaneo y calcula el total de la compra.
 */
public class Supermercado {

    private final LinkedHashMap<String, Double> productos;

    public Supermercado() {
        productos = new LinkedHashMap<>();
    }

    public void registrarProducto(String producto, double precio) {
        productos.put(producto, precio);
    }

    public double calcularTotal() {
        double total = 0;

        for (double precio : productos.values()) {
            total += precio;
        }

        return total;
    }

    public void mostrarCompra() {
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.printf("%s - $%.2f%n", producto.getKey(), producto.getValue());
        }
    }
}

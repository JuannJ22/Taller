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

    /**
     * Registra un producto junto con su precio. LinkedHashMap conserva el orden
     * en que los productos fueron ingresados.
     *
     * @param producto nombre del producto
     * @param precio precio registrado
     */
    public void registrarProducto(String producto, double precio) {
        productos.put(producto, precio);
    }

    /**
     * Recorre todos los precios almacenados y obtiene el valor total de la compra.
     *
     * @return suma de los precios registrados
     */
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

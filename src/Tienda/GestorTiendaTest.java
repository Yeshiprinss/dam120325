
package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class GestorTiendaTest {

    static GestorTienda gestorTienda;

    @BeforeAll
    static void setUpBeforeClass() {
        gestorTienda = new GestorTienda();
    }

    @Test
    void testCalcularDescuento() {
        assertEquals(10.0, gestorTienda.calcularDescuento(100, 10), 0.0001);
        assertEquals(5.0, gestorTienda.calcularDescuento(100, 5), 0.0001);
        assertEquals(0.0, gestorTienda.calcularDescuento(100, 3), 0.0001);
    }

	@Test
    void testCategorizarProducto() {
        assertEquals("Económico", gestorTienda.categorizarProducto(5));
        assertEquals("Estándar", gestorTienda.categorizarProducto(20));
        assertEquals("Premium", gestorTienda.categorizarProducto(100));

	}

	@Test
    void testBuscarProducto() {
        String[] inventario = {"Manzana", "Banana", "Uva"};
        assertEquals("Banana", gestorTienda.buscarProducto(inventario, "Banana"));
        assertEquals("Uva", gestorTienda.buscarProducto(inventario, "uva"));
        assertNull(gestorTienda.buscarProducto(inventario, "Naranja"));
}
}

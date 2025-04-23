package examenSegundoTrimestre;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CAJA_BLANCA_ManuelFernandezOrdoñez {
	Departamento d = new Departamento ();

	// Estop es un metodo para que al añadir un presupuesto sea mayor el presupuesto que el pedido
	@Test
	public void testProcesarPedidos() {
		double resultado = d.procesarPedido(false);
		assertEquals("Debe ser mayor el presupuesto que el pedido ", resultado );
	}
	// Esto es un metodo para que el usuario no añada un monto negativo
		@Test
		public void testRealizarPedidosNEgativo() {
			Instituto i = new Instituto (2);
			boolean resultado = i.realizarPedido("Departamento de Historia", -1);
			assertEquals("El monto no puede ser un numero negativo",resultado);
		}
		// Esto es para que el usuario no meta un monto mas grande que el numero que he elegido yo
		@Test
		public void testRealizarPedidosDemasiadoGrande() {
			Instituto i = new Instituto (2);
			boolean resultado = i.realizarPedido("Departamento de Historia", 100.000);
			assertEquals("El monto no puede ser un numero tan grande",resultado);
		}
	}

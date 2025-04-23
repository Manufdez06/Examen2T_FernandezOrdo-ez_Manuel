package examenSegundoTrimestre;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class INTEGRACION_ManuelFernandezOrdoñez {
	Departamento d = new Departamento ();
	Instituto i = new Instituto (2);
	
	// Esto es un metodo para que el usuario que pruebe a no meter el nombre del departamento no esté vacio
	@Test
	public void testRealizarPedidosvacio() {
		Instituto i = new Instituto (2);
		boolean resultado = i.realizarPedido(" ", 150);
		assertEquals("EL nombre del departamento no puede estar vacios",resultado);
	}
	
	// Esto es un metodo para que el nombre del departamento no sea null
	@Test
	public void testRealizarPedidosNull() {
		Instituto i = new Instituto (2);
		boolean resultado = i.realizarPedido(null, 150);
		assertEquals("EL nombre del departamento y el monto no puede ser null",resultado);
	}
}

package examenSegundoTrimestre;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CAJA_NEGRA_ManuelFernandezOrdoñez {
	// Metodo para que el departamento su nombre no este en null
	@Test
	public void testDepartamentoNombreNull()  {
		Departamento d = new Departamento();
		String resultado = d.departamentos(null, 15);
		assertEquals("EL nombre no puede ser null",resultado);
	}
	// Metodo para que el departamento su nombre no este vacio

	@Test
	public void testDepartamentoNombrevacio()  {
		Departamento d = new Departamento();
		String resultado = d.departamentos(" ", 15);
		assertEquals("EL nombre no puede estar vacio",resultado);
	}
	
	// Metodo para que el presupuesto no sea negativo

	@Test
	public void testDepartamentopresupuestoNeg()  {
		Departamento d = new Departamento();
		String resultado = d.departamentos("Pepe ", -10);
		assertEquals("EL presupuesto no puede ser negativo",resultado);
	}

	// Metodo para que el presupuesto no supere la cantidad indicada porque sino seria muy grande los numeros

	@Test
	public void testRealizarPedidos() {
		Instituto i = new Instituto (2);
		boolean resultado = i.realizarPedido(null, 100.000);
		assertEquals("EL presupuesto del departamento no puede superar la cantidad indicada",resultado);
	}
	


}

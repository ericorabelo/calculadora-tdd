package calculadora.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import calculadora.controlador.Calculadora;
import junit.framework.Assert;

class TesteCalculadora {

	@Test
	void testaSomaDoisInteirosValidosCorretamente() {
		Calculadora calculadora = new Calculadora();
		int resultadoObtido = calculadora.soma(1, 3);
		int resultadoEsperado = 4;
		Assert.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	void testaDivideDoisInteirosValidosCorretamente() {
		Calculadora calculadora = new Calculadora();
		float resultadoObtido = calculadora.divide(1, 3);
		float resultadoEsperado = (float) 1/3;
		Assert.assertEquals(resultadoEsperado, resultadoObtido, 0.1);
	}
	
	@Test
	void testaDivisaoPorZeros() {
		Calculadora calculadora = new Calculadora();
		ExpectedException thrown = ExpectedException.none();
		thrown.expect(ArithmeticException.class);
		calculadora.divide(2, 0);	
	}

}

package com.devs4j.curso.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.devs4j.curso.interfaces.figuras.CalculadorDeAreas;
import com.devs4j.curso.interfaces.figuras.Circulo;
import com.devs4j.curso.interfaces.figuras.Cuadro;
import com.devs4j.curso.interfaces.figuras.Figura;
import com.devs4j.curso.interfaces.figuras.Rectangulo;
import com.devs4j.curso.interfaces.figuras.Triangulo;

public class TestCalculadorDeAreas {

	@Test
	public void simpleTest() {
		double areaTotal = CalculadorDeAreas.calcularAreasTotales(
				new Figura[] { new Circulo(12), new Cuadro(12), new Rectangulo(10, 20), new Triangulo(12, 2) });
		
		assertEquals(808.3893421169303, areaTotal, 10);
		new Circulo(10).imprimirDescription();;
	}
}

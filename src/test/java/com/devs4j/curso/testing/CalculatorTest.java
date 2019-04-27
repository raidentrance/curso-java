/**
 * 
 */
package com.devs4j.curso.testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author raidentrance
 *
 */
public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void testSumPositiveValues_withNegativeValues() {
		int result = calculator.sumPositiveValues(-10, -20, -30);
		assertTrue(result == 0);
	}

	@Test
	public void testSumPositiveValues_withPositiveValues() {
		int result = calculator.sumPositiveValues(10, 20, 30);
		assertTrue(result == 60);
	}
}

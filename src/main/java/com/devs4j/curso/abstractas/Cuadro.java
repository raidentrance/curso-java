/**
 * 
 */
package com.devs4j.curso.abstractas;

/**
 * @author raidentrance
 *
 */
public class Cuadro extends Figura {
	private double lado;

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}

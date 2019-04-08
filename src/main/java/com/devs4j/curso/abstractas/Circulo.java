package com.devs4j.curso.abstractas;

/**
 * @author raidentrance
 *
 */
public class Circulo extends Figura {
	private double radio;

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}

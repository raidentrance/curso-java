package com.devs4j.curso.interfaces.figuras;

public class Cuadro implements Figura {
	private double lado;

	public Cuadro(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}


}

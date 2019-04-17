package com.devs4j.curso.interfaces.figuras;

public class CalculadorDeAreas {

	public static double calcularAreasTotales(Figura[] figuras) {
		double sumaDeAreas = 0.0;
		for (Figura figura : figuras) {
			sumaDeAreas += figura.calcularArea();
		}
		return sumaDeAreas;
	}

	public static void main(String[] args) {
		Figura cuadro = new Cuadro(10);
		
		Figura circulo = new Circulo(20);
		Figura rectangulo = new Rectangulo(10, 20);
		Figura triangulo = new Triangulo(10, 20);
		double areaTotal = calcularAreasTotales(new Figura[] { cuadro, circulo, rectangulo, triangulo });
		System.out.println("el area de todas las figuras es de :" + areaTotal);
	}
}

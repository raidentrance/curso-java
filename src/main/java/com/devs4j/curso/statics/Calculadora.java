package com.devs4j.curso.statics;

public class Calculadora {

	static int suma(int x, int y) {
		return x + y;
	}

	static int resta(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		int resultado = suma(10, 20);
		System.out.println(resultado);
	}
}

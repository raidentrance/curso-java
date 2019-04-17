package com.devs4j.curso.arrays.varargs;

public class Calculadora {
	// suma(int y, int ...x)
	public static int suma( int... x) {
		int suma = 0;
		for (int valor : x) {
			suma += valor;
		}
		return suma;
	}
	public static int suma( int x) {
		System.out.println("El de abajo");
		return x;
	}
	

	public static void main(String... args) {
		System.out.println(suma(10));
		System.out.println(suma(10, 20, 30));
		System.out.println(suma(10, 20));
		System.out.println(suma(10, 20, 40, 50));
		System.out.println(suma(10, 20, 40, 50, 60));
		System.out.println(suma(10, 20, 40, 50, 60, 80));
		System.out.println(suma(10, 20, 40, 50, 60, 80, 90));
	}
}

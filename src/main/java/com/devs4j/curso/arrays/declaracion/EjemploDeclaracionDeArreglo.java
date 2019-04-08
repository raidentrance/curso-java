package com.devs4j.curso.arrays.declaracion;

/**
 * 
 * @author raidentrance
 *
 */
public class EjemploDeclaracionDeArreglo {
	public static void main(String[] args) {
		int numerosImplicito[] = { 10, 11, 2, 12, 3, 34, 2, 12 };
		int numerosExplicito[] = new int[4];
		numerosExplicito[0] = 10;
		numerosExplicito[1] = 10;
		numerosExplicito[2] = 10;
		numerosExplicito[3] = 10;
		numerosExplicito[4] = 10;

		System.out.println("Tamaño implicito : " + numerosImplicito.length);
		System.out.println("Tamaño explicito : " + numerosExplicito.length);
	}
}

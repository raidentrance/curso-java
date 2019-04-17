package com.devs4j.curso.arrays.declaracion;

/**
 * 
 * @author raidentrance
 *
 */
public class EjemploDeclaracionDeArreglo {
	static void print(int []array){
		for (int temp : array) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		/**
		 * Inicialización de forma implicita
		 */
		int numerosImplicito[] = { 10, 11, 2, 12, 3, 34, 2, 12 };
		print(numerosImplicito);
		/**
		 * Explícita
		 */
		int numerosExplicito[] = new int[4];
		numerosExplicito[0] = 10;
		numerosExplicito[1] = 10;
		numerosExplicito[2] = 10;
		numerosExplicito[3] = 10;
		numerosExplicito[4] = 10;
		/**
		 * Anónimo
		 */
		int numerosAnonimos[] = new int[] { 10, 20, 30, 40 };
		System.out.println("Tamaño implicito : " + numerosImplicito.length);
		System.out.println("Tamaño explicito : " + numerosExplicito.length);
		System.out.println("Tamaño explicito : " + numerosAnonimos.length);

	}
}

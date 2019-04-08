package com.devs4j.curso.flujo;

public class EjemploFor {

	public static void main(String[] args) {
		// Imprime los valores del 1 al 9
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println("\n\n");

		for (int i = 0, j = 10; i != j; i++, j--) {
			System.out.println(i + " " + j);
		}
		
		for (int i = 0, j = 10; ; i++, j--) {
			System.out.println(i + " " + j);
			if(i==j){
				break;
			}
		}
	}

}

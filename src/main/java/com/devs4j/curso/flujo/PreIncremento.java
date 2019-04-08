package com.devs4j.curso.flujo;


public class PreIncremento {
	
	public static void main(String[] args) {
		int c=10;
		System.out.println(c);
		//Se incrementa el valor y después se evalúa la expresión por eso imprime 11
		System.out.println(++c);
		//Se evalua la expresión y después se incrementa por eso no se ve el cambio a 12
		System.out.println(c++);
		//Como esta es la siguiente línea ya se ve el cambio reflejado
		System.out.println(c);
	}
}

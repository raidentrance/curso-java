package com.devs4j.curso.statics;

public class BloquesStatic {
	{
		System.out.println("Bloque anonimo");
	}
	static {
		System.out.println("Hola Mundo");
	}
	static {
		System.out.println("Hola Mundo 2");
	}
	{
		System.out.println("Bloque anonimo 2 ");
	}

	public static void main(String[] args) {
		new BloquesStatic();
	}
}

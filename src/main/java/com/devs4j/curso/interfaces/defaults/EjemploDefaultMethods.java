package com.devs4j.curso.interfaces.defaults;

interface A {
	default void foo() {
		System.out.println("Método default");
	}

	void bar();
}

public class EjemploDefaultMethods implements A {

	public static void main(String[] args) {
		new EjemploDefaultMethods().foo();
	}

	@Override
	public void bar() {
		System.out.println("Bar implementation");
	}
}

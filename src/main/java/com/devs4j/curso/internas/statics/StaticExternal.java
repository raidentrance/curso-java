package com.devs4j.curso.internas.statics;

public class StaticExternal {
	static class Interna {
		void foo() {
			System.out.println("Foo");
		}
	}

	public static void main(String[] args) {
		Interna internal = new Interna();
		internal.foo();
	}
}

package com.devs4j.curso.internas.anonymous;

abstract class Test {
	abstract void foo();
}
public class AnonymousClass {
	public static void main(String[] args) {
		Test object = new Test() {
			@Override
			void foo() {
				System.out.println("Foo");
			}
		};
		object.foo();
	}
}

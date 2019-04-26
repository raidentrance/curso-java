/**
 * 
 */
package com.devs4j.curso.internas.anonymous;

/**
 * @author raidentrance
 *
 */

interface Foo {
	void foo();
}

public class InterfaceExample {
	public static void main(String[] args) {
		Foo f = new Foo() {

			@Override
			public void foo() {
				System.out.println("Foo implementation");
			}
		};
		f.foo();
	}
}

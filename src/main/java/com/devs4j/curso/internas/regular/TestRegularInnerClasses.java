package com.devs4j.curso.internas.regular;

public class TestRegularInnerClasses {

	public static void main(String[] args) {
		External external = new External();
		External.Internal internal = external.new Internal();
		external.foo();
		internal.bar();
	}
}

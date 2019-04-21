package com.devs4j.curso.exceptions.errors;

class B{
	public B() {
		new A();
	}
}

public class A extends B{
	
	public static void main(String[] args) {
		new A();
	}
}

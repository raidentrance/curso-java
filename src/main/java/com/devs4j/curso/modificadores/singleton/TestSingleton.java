package com.devs4j.curso.modificadores.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		ColaDeImpresion c=ColaDeImpresion.getInstance();
		
		ColaDeImpresion c2=ColaDeImpresion.getInstance();
		
		System.out.println(c==c2);
		
		
	}
}

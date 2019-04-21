package com.devs4j.curso.modificadores.paquete1;

public class ModificadoresTest {
	private String testPrivate;
	protected String testProtected;
	String testDefault;
	public String testPublic;

	public void print() {
		System.out.println(testPrivate);
	}
}

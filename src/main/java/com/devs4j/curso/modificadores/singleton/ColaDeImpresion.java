package com.devs4j.curso.modificadores.singleton;

public class ColaDeImpresion {
	private static ColaDeImpresion instance;

	private ColaDeImpresion() {
	}

	public static ColaDeImpresion getInstance() {
		if (instance == null) {
			instance = new ColaDeImpresion();
		}
		return instance;
	}
}

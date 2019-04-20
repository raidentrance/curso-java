package com.devs4j.curso.exceptions.customautoclosable;

public class TestMirecurso {
	public static void main(String[] args) {
		try (MiRecurso recurso = new MiRecurso()) {
			recurso.imprimirMensaje();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}

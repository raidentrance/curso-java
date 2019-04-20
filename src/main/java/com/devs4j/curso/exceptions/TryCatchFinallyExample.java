package com.devs4j.curso.exceptions;

public class TryCatchFinallyExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			/**
			 * Código que puede generar excepciones
			 */
			// String s = null;
			// s.toCharArray();
			int x = 0;
			int y = 10 / x;
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Catch del null pointer exception o de arithmetic exception");
		} catch (Exception e) {
			System.out.println("Se generó una excepción");
			e.printStackTrace();
			/**
			 * Código a ejecutar en caso de que se genere una excepción
			 */
		} finally {
			System.out.println("Siempre se ejecuta");
			/**
			 * Código a ejecutar sin importar si se generó o no una excepción
			 */
		}
	}
}

package com.devs4j.curso.exceptions.customexception;

public class TestCustomException {
	public void validarEdad(int edad) throws MenorDeEdadException {
		if (edad < 18) {
			throw new MenorDeEdadException();
		}
	}

}

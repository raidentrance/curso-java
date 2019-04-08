package com.devs4j.curso.herencia;

public class Estudiante extends Persona {

	int numeroDeCuenta;
	double promedio;

	void estudiar() {
		System.out.println("Estoy estudiando");
	}

	void aprobar() {
		System.out.println("Ya pase la materia");
	}

	void reprobar() {
		System.out.println("Ya reprobe la materia");
	}
	
	@Override
	void dormir(){
		System.out.println("Soy estudiante duermo menos");
	}

	@Override
	public String toString() {
		return "Estudiante [numeroDeCuenta=" + numeroDeCuenta + ", promedio=" + promedio + "]";
	}

}

package com.devs4j.curso.herencia;

class Empleado extends Persona{}
public class TestPersona {

	public static void main(String[] args) {
		Persona e=new Estudiante();
		
		System.out.println(e instanceof Persona);
		System.out.println(e instanceof Estudiante);
		System.out.println(e instanceof Object);
		System.out.println(e instanceof Empleado);

	}
}

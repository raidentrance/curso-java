package com.devs4j.curso.classes;

class TestPersona{

	/**
	Este programa crea un objeto de tipo persona y valida si es mayor de 
	edad
	**/
	public static void main(String args[]){
		Persona p=new Persona();
		p.edad=12;
		p.nombre="Pepe";
		p.sueldo=100000.0f;
		p.caminar();

		boolean esMayor=p.esMayoDeEdad();
		System.out.println(esMayor);
		// Esto es un ciclo infinito
		while(true){
			p.caminar();
		}

	}
}
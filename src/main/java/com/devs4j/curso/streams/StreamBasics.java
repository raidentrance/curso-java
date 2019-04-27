package com.devs4j.curso.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

public class StreamBasics {
	public static void main(String[] args) {
		List<Persona> personas = Arrays
				.asList(new Persona[] { new Persona("Alex", "Bautista", 30), new Persona("Diego", "López", 15),
						new Persona("Pepe", "Sánchez", 34), new Persona("Juana", "Sánchez", 23),
						new Persona("Rodrigo", "Sánchez", 14), new Persona("Carla", "Sánchez", 22),
						new Persona("Jorge", "Sánchez", 67), new Persona("Jimena", "Sánchez", 33) });

		List<Persona> primerosMayores = personas.stream().filter(p -> p.getEdad() >= 18).limit(3)
				.collect(Collectors.toList());
		int count = 0;
		List<Persona> resultado = new ArrayList<>();
		for (Persona persona : personas) {
			if (persona.getEdad() >= 18) {
				resultado.add(persona);
				count++;
				if (count == 3) {
					break;
				}
			}
		}
		System.out.println("Sin stream " + resultado);
		System.out.println("Con stream " + primerosMayores);
	}
}

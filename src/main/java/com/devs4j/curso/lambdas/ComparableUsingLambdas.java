/**
 * 
 */
package com.devs4j.curso.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author raidentrance
 *
 */
class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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

}

public class ComparableUsingLambdas {
	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Juan", "López"));
		personas.add(new Persona("Arturo", "Sánchez"));
		Comparator<Persona> comparator = (Persona p, Persona p2) -> p.getNombre().compareTo(p2.getNombre());
		Collections.sort(personas, comparator);
	}
}

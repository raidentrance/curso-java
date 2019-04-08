package com.devs4j.curso.constructores;

public class Perro {
	private String nombre;
	private String raza;

	public Perro() {
		super();
	}

	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}

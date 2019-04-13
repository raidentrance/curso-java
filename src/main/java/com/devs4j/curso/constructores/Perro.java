package com.devs4j.curso.constructores;

public class Perro {
	private String nombre;
	private String raza;
	private long lastUpdateTimestamp;

	public Perro() {
		this("Solovino", "Electrico");
		System.out.println("Creando un perrillo por defecto");
	}

	public Perro(String n, String r) {
		this(n);
		System.out.println("Creando un perrillo con nombre y raza");
		lastUpdateTimestamp = System.currentTimeMillis();
		raza = r;
	}

	public Perro(String n) {
		nombre = n;
		lastUpdateTimestamp = System.currentTimeMillis();
	}

	{
		System.out.println("Bloque anonimo 1");
		lastUpdateTimestamp = System.currentTimeMillis();
	}
	{
		System.out.println("Bloque anonimo 2");
	}

	public long getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
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

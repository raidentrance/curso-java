package com.devs4j.curso.statics;

public class Humano {

	private String nombre;
	static int numeroDeHumanos = 0;

	public Humano(String nombre) {
		this.nombre = nombre;
		numeroDeHumanos++;
	}

	public String getNombre() {
		return nombre;
	}

	public static void main(String[] args) {
		Humano humano = new Humano("Pepe");
		System.out.println(humano.getNombre());
		System.out.println(numeroDeHumanos);

		Humano humano2 = new Humano("Pancho");
		System.out.println(humano2.getNombre());
		System.out.println(numeroDeHumanos);

		Humano humano3 = new Humano("Arturo");
		System.out.println(humano3.getNombre());
		System.out.println(numeroDeHumanos);

		Humano humano4 = new Humano("Javier");
		System.out.println(humano4.getNombre());
		System.out.println(numeroDeHumanos);
	}
}

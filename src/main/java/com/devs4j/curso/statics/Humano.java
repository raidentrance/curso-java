package com.devs4j.curso.statics;

public class Humano {
	static int numeroDeHumanos = 0;

	public Humano() {
		numeroDeHumanos++;
	}

	public static void main(String[] args) {
		new Humano();
		new Humano();
		new Humano();
		new Humano();
		System.out.println(numeroDeHumanos);
	}
}

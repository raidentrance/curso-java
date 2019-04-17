package com.devs4j.curso.interfaces.abstracts;

interface Jugeton {
	int X = 10;

	void jugar();
}

abstract class Animal implements Jugeton {
	private int edad;

	public Animal(int edad) {
		this.edad = edad;
	}

	/**
	 * La clase que herede de animal DEBE implementar respirar
	 */
	abstract void respirar();

	/**
	 * Si quieren lo pueden sobreescribir y si no no
	 */
	final void dormir() {
		System.out.println("El animal duerme");
	}

	public int getEdad() {
		return edad;
	}

}

class Perro extends Animal {
	public Perro(int edad) {
		super(edad);
	}

	@Override
	void respirar() {
		System.out.println("Aspiro por la nariz por que soy terrestre");
	}

	@Override
	public void jugar() {
		System.out.println("Soy un perro y soy muy jugueton");
	}

}

class Pez extends Animal {
	public Pez(int edad) {
		super(edad);
	}

	@Override
	void respirar() {
		System.out.println("Branquial");
	}

	@Override
	public void jugar() {
		System.out.println("Yo no soy jugueton :(");
	}

}

public class TestAnimales {

	public static void hacerQueRespiren(Animal[] animales) {
		int x = Jugeton.X;
		System.out.println("X es una constante" + x);
		for (Animal animal : animales) {
			animal.respirar();
		}
	}

	public static void main(String[] args) {
		hacerQueRespiren(new Animal[] { new Perro(10), new Pez(20) });
	}

}

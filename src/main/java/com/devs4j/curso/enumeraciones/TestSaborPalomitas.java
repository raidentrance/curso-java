package com.devs4j.curso.enumeraciones;

public class TestSaborPalomitas {
	public static void main(String[] args) {
		System.out.println("Que tipo de palomitas quieres?");
		SaborPalomitas[] values = SaborPalomitas.values();
		for (SaborPalomitas saborPalomitas : values) {
			System.out.println(saborPalomitas);
		}
	}
}

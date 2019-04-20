package com.devs4j.curso.sets.comparable;

import java.util.TreeSet;

public class TestRockero {
	public static void main(String[] args) {
		TreeSet<Rockero> rockeros = new TreeSet<>();
		rockeros.add(new Rockero("Robert Plant", "Robert Plant", 1000000l, "Led zepellin"));
		rockeros.add(new Rockero("Jimmy Page", "Jimmy Page", 1000000l, "Led zepellin"));
		rockeros.add(new Rockero("Alejandro Lora", "Alex lora", 100000l, "El tri"));
		
		for (Rockero rockero : rockeros) {
			System.out.println(rockero.getNombre());
		}
	}
}

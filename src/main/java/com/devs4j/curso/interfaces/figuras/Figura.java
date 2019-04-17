package com.devs4j.curso.interfaces.figuras;

public abstract interface Figura {
	public double calcularArea();
	
	default void imprimirDescription(){
		System.out.println("El método calcular area calcula el area");
	}
	
}

package com.devs4j.curso.abstractas;

public abstract class Figura {
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public abstract double calcularArea();
}

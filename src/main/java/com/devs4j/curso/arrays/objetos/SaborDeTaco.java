package com.devs4j.curso.arrays.objetos;

public enum SaborDeTaco {
	BISTEC(10.5f), PASTOR(8.5f), SUADERO(15.5f),COCHINITA(20.5f);

	private float precio;

	private SaborDeTaco(float precio) {
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}
}

/**
 * 
 */
package com.devs4j.curso.enumeraciones;

/**
 * @author raidentrance
 *
 */
public enum TamanioDePalomitas {
	CHICA(20.5f), MEDIANA(30.1f), GRANDE(50.0f);

	private float precio;

	private TamanioDePalomitas(float precio) {
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}
}

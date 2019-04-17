/**
 * 
 */
package com.devs4j.curso.enumeraciones;

/**
 * @author raidentrance
 *
 */
public enum TamanioDePalomitas {
	CHICA(20.5f, "Carton"), MEDIANA(30.1f, "Carton"), GRANDE(50.0f, "Plastico"), SUPERGRANDE;

	private float precio;

	private String material;

	private TamanioDePalomitas(float precio, String material) {
		this.precio = precio;
		this.material = material;
	}
	private TamanioDePalomitas() {
		System.out.println("Constructor por defecto");
	}

	public float getPrecio() {
		return precio;
	}

	public String getMaterial() {
		return material;
	}
	
	

}

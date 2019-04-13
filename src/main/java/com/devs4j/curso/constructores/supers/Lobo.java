package com.devs4j.curso.constructores.supers;

public class Lobo extends Monstruo {
	private String colorDePelaje;
	private boolean tieneGarras;

	/**
	 * Construye un lobo con valores de monstruo por default y valores nulos
	 * para lobo
	 */
	public Lobo() {
		super();
		System.out.println("Constructor vacío de la clase Lobo");
	}

	/**
	 * Construye un lobo personalizado con valores tanto para monstruo como para
	 * lobo
	 */
	public Lobo(String colorDePelaje, boolean tieneGarras, int cantidadDeOjos, String color, boolean tieneCuernos) {
		super(cantidadDeOjos, color, tieneCuernos);
		this.colorDePelaje = colorDePelaje;
		this.tieneGarras = tieneGarras;

	}

	/**
	 * Un default de monstruo con personalización para lobo
	 */
	public Lobo(String colorDePelaje, boolean tieneGarras) {
		super();
		this.colorDePelaje = colorDePelaje;
		this.tieneGarras = tieneGarras;
	}

	public String getColorDePelaje() {
		return colorDePelaje;
	}

	public void setColorDePelaje(String colorDePelaje) {
		this.colorDePelaje = colorDePelaje;
	}

	public boolean isTieneGarras() {
		return tieneGarras;
	}

	public void setTieneGarras(boolean tieneGarras) {
		this.tieneGarras = tieneGarras;
	}

}

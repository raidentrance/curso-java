package com.devs4j.curso.constructores.supers;

public class Monstruo {
	private int cantidadDeOjos;
	private String color;
	private boolean tieneCuernos;

	public Monstruo() {
		this(2, "Verde", false);
		System.out.println("Constructor vacío de la clase padre");
	}

	public Monstruo(int cantidadDeOjos, String color, boolean tieneCuernos) {
		this.cantidadDeOjos = cantidadDeOjos;
		this.color = color;
		this.tieneCuernos = tieneCuernos;
	}

	public int getCantidadDeOjos() {
		return cantidadDeOjos;
	}

	public void setCantidadDeOjos(int cantidadDeOjos) {
		this.cantidadDeOjos = cantidadDeOjos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTieneCuernos() {
		return tieneCuernos;
	}

	public void setTieneCuernos(boolean tieneCuernos) {
		this.tieneCuernos = tieneCuernos;
	}

}

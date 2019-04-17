package com.devs4j.curso.metodos;

public class Auto {
	private String coche;
	private Motor motor;

	public Auto(String coche, Motor motor) {
		this.coche = coche;
		this.motor = motor;
	}

	public String getCoche() {
		return coche;
	}

	public void setCoche(String coche) {
		this.coche = coche;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}

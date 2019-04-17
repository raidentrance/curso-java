package com.devs4j.curso.metodos;

public class TestAutos {
	public static void main(String[] args) {
		Motor motor = new Motor("v3");
		Auto auto = new Auto("Mazda 3", motor);
		
		Motor motorQueObtuve = auto.getMotor();
		String modeloDelMotor = motorQueObtuve.getModelo();
		String modeloEnMayusculas=modeloDelMotor.toUpperCase();
		int longitudDelModeloDelMotor=modeloEnMayusculas.length();
		System.out.println(longitudDelModeloDelMotor);
		System.out.println(auto.getMotor().getModelo().toUpperCase().length());

		
		System.out.println(auto.toString().toUpperCase().length());
		
	}
}

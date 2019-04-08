package com.devs4j.curso.composicion;

/**
 * 
 */

/**
 * @author raidentrance
 *
 */
public class Auto{
	private Motor motorcin;
	
	public Motor getMotorcin() {
		return motorcin;
	}

	public void setMotorcin(Motor moto) {
		motorcin = moto;
	}

	void avanzar(){
		motorcin.encender();
		System.out.println("Estoy avanzando");
		motorcin.apagar();
	}
	
	public static void main(String[] args) {
		Auto auto=new Auto();
		auto.setMotorcin(new Motor());
		auto.avanzar();
		
		auto.getMotorcin();
	
	}
}

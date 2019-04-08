package com.devs4j.curso.encapsulamiento.persona;

/**
 * 
 */

/**
 * @author raidentrance
 *
 */
public class Persona {
	String nombre;
	private int edad;
	static final int MAYORIA_DE_EDAD=18;
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int ed){
		if(ed<0 ||ed > 100){
			System.err.println("Error en el sistema");
		}
		edad=ed;
	}
	
	public boolean esMayorDeEdad(){
		if(edad>MAYORIA_DE_EDAD){
			return true;
		}else{
			return false;
		}
	}
	
}

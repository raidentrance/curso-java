/**
 * 
 */
package com.devs4j.curso.arrays.objetos;

/**
 * @author raidentrance
 *
 */
public class Taqueria {
	public static void main(String[] args) {
		Taco orden1[] = new Taco[3];
		orden1[0] = new Taco(SaborDeTaco.PASTOR, true, true);
		orden1[1] = new Taco(SaborDeTaco.BISTEC, false, true);
		orden1[2] = new Taco(SaborDeTaco.SUADERO, true, true);

		float precioTotal = 0.0f;
		for (Taco taco : orden1) {
			precioTotal += taco.getSaborDeTaco().getPrecio();
		}
		System.out.println("El precio de la orden es de : " + precioTotal);
	}
}

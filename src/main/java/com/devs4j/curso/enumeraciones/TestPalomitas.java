/**
 * 
 */
package com.devs4j.curso.enumeraciones;

/**
 * @author raidentrance
 *
 */
public class TestPalomitas {
	public static void main(String[] args) {
		Palomitas palomitas = new Palomitas();
		palomitas.setSabor(SaborPalomitas.CARAMELO);
		palomitas.setTamanio(TamanioDePalomitas.MEDIANA);

		System.out.println("Sus palomitas cuestan : " + palomitas.getTamanio().getPrecio());

		TamanioDePalomitas tamanioMediano = TamanioDePalomitas.MEDIANA;
		System.out.println(tamanioMediano.getPrecio());
	}
}

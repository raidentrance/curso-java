/**
 * 
 */
package com.devs4j.curso.exceptions.throwsejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raidentrance
 *
 */
public class SolicitudController {
	private static SolicitudService service = new SolicitudService();
	//Recuerden poner import java.io.*;
	public static String leerString(String mensaje) throws IOException {
		System.out.println(mensaje);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		do {
			String opcion = leerString(
					"Que quieres hacer?\n  1) Crear solicitud \n 2) Borrar solicitud \n 3) Buscar solicitud :");
			int opcionEnInt = Integer.parseInt(opcion);
			switch (opcionEnInt) {
			case 1:
				String id = leerString("Indica el id de la solicitud");
				String nombre = leerString("Indica el nombre de la solicitud");
				String responsable = leerString("Indica el responsable de la solicitud");
					
				service.crear(Integer.parseInt(id), nombre, responsable);
				System.out.println("Se creó correctamente");
				break;
			case 2:
				String nombreABorrar = leerString("Indica el nombre de la solicitud a borrar ");
				try {
					service.borrar(nombreABorrar);
					System.out.println("Se borró correctamente");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				String nombreABuscar = leerString("Indica el nombre de la solicitud a buscar ");
				try {
					Solicitud resultado = service.buscar(nombreABuscar);
					System.out.println("Se encontro la solicitud " + resultado);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				break;
			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (true);
	}
}

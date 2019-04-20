/**
 * 
 */
package com.devs4j.curso.exceptions.throwsejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raidentrance
 *
 */
public class SolicitudDao {
	private List<Solicitud> solicitudes = new ArrayList<>();

	public Solicitud buscarSolicitudPorNombe(String nombre) throws Exception {
		for (Solicitud solicitud : solicitudes) {
			if (solicitud.getNombre().equals(nombre)) {
				return solicitud;
			}
		}
		throw new Exception("La solicitud no se encontro ");
	}

	public void agregarSolicitud(Solicitud solicitud) {
		solicitudes.add(solicitud);
	}

	public void borrarSolicitud(String nombre) throws Exception {
		Solicitud solicitudPorNombe = buscarSolicitudPorNombe(nombre);
		solicitudes.remove(solicitudPorNombe);
	}

}

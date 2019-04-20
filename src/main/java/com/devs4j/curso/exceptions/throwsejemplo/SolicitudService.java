package com.devs4j.curso.exceptions.throwsejemplo;

public class SolicitudService {
	
	private SolicitudDao dao=new SolicitudDao();
	
	public void crear(Integer id, String nombre, String responsable) {
		Solicitud solicitud=new Solicitud(id, nombre, responsable);
		dao.agregarSolicitud(solicitud);
	}
	
	public Solicitud buscar(String nombre) throws Exception{
		Solicitud solicitudEncontrada = dao.buscarSolicitudPorNombe(nombre);
		return solicitudEncontrada;
	}
	
	public void borrar(String nombre) throws Exception {
		dao.borrarSolicitud(nombre);
	}
}

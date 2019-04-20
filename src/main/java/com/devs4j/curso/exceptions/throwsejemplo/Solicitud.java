package com.devs4j.curso.exceptions.throwsejemplo;

public class Solicitud {
	private Integer idSolucitud;
	private String nombre;
	private String responsable;

	public Solicitud(Integer idSolucitud, String nombre, String responsable) {
		super();
		this.idSolucitud = idSolucitud;
		this.nombre = nombre;
		this.responsable = responsable;
	}

	public Integer getIdSolucitud() {
		return idSolucitud;
	}

	public void setIdSolucitud(Integer idSolucitud) {
		this.idSolucitud = idSolucitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Solicitud [idSolucitud=" + idSolucitud + ", nombre=" + nombre + ", responsable=" + responsable + "]";
	}

}

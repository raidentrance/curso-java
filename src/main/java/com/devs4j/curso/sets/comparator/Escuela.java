package com.devs4j.curso.sets.comparator;

public class Escuela {
	private String nombre;
	private Integer numeroDeEstudiantes;
	private Integer numeroDeGrupos;
	private String ubicacion;

	public Escuela() {
	}

	public Escuela(String nombre, Integer numeroDeEstudiantes, Integer numeroDeGrupos, String ubicacion) {
		this.nombre = nombre;
		this.numeroDeEstudiantes = numeroDeEstudiantes;
		this.numeroDeGrupos = numeroDeGrupos;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDeEstudiantes() {
		return numeroDeEstudiantes;
	}

	public void setNumeroDeEstudiantes(Integer numeroDeEstudiantes) {
		this.numeroDeEstudiantes = numeroDeEstudiantes;
	}

	public Integer getNumeroDeGrupos() {
		return numeroDeGrupos;
	}

	public void setNumeroDeGrupos(Integer numeroDeGrupos) {
		this.numeroDeGrupos = numeroDeGrupos;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escuela other = (Escuela) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", numeroDeEstudiantes=" + numeroDeEstudiantes + ", numeroDeGrupos="
				+ numeroDeGrupos + ", ubicacion=" + ubicacion + "]";
	}
}

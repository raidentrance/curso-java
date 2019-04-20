package com.devs4j.curso.sets.comparable;

public class Rockero implements Comparable<Rockero> {
	private String nombre;
	private String nombreArtistico;
	private long fans;
	private String banda;

	public Rockero(String nombre, String nombreArtistico, long fans, String banda) {
		this.nombre = nombre;
		this.nombreArtistico = nombreArtistico;
		this.fans = fans;
		this.banda = banda;
	}

	public Rockero() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public long getFans() {
		return fans;
	}

	public void setFans(long fans) {
		this.fans = fans;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreArtistico == null) ? 0 : nombreArtistico.hashCode());
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
		Rockero other = (Rockero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreArtistico == null) {
			if (other.nombreArtistico != null)
				return false;
		} else if (!nombreArtistico.equals(other.nombreArtistico))
			return false;
		return true;
	}

	@Override
	public int compareTo(Rockero o) {
//		return nombre.compareTo(o.getNombre());
		return o.getNombre().compareTo(nombre);
	}

	@Override
	public String toString() {
		return "Rockero [nombre=" + nombre + ", nombreArtistico=" + nombreArtistico + ", fans=" + fans + ", banda="
				+ banda + "]";
	}

}

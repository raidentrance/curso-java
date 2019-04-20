package com.devs4j.curso.sets.comparator;

import java.util.Comparator;

public class EscuelaComparatorPorNombre implements Comparator<Escuela> {

	@Override
	public int compare(Escuela o1, Escuela o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}

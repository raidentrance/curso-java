package com.devs4j.curso.sets.comparator;

import java.util.Comparator;

public class EscuelaComparatorPorNumeroDeEstudiantes implements Comparator<Escuela> {

	@Override
	public int compare(Escuela o1, Escuela o2) {
		return o1.getNumeroDeEstudiantes().compareTo(o2.getNumeroDeEstudiantes());
	}

}

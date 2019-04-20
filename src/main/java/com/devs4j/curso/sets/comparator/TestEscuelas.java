package com.devs4j.curso.sets.comparator;

import java.util.TreeSet;

public class TestEscuelas {
	public static void main(String[] args) {
		TreeSet<Escuela> escuelas = new TreeSet<>(new EscuelaComparatorPorNumeroDeEstudiantes());
		escuelas.add(new Escuela("Facultad de ingeniería", 20000, 200, "CU"));
		escuelas.add(new Escuela("UPIICSA", 30000, 100, "Iztacalco"));
		escuelas.add(new Escuela("ITC", 20000, 200, "Xochimilco"));
		
		for (Escuela escuela : escuelas) {
			System.out.println(escuela);
		}
		
		
		
	}
}

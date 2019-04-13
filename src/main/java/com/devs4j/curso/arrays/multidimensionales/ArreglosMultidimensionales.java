package com.devs4j.curso.arrays.multidimensionales;

public class ArreglosMultidimensionales {

public static void main(String[] args) {
	int arrays[][] = { { 2, 2 }, { 4, 4 }, { 5, 5 } };
	for (int[] array : arrays) {
		for (int value : array) {
			System.out.print("\t " + value);
		}
		System.out.println();
	}
}
}

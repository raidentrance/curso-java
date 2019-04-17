package com.devs4j.curso.arrays.multidimensionales;

public class ArreglosMultidimensionales {
	public static void printExplicitos() {
		int arrays[][] = new int[3][];
		arrays[0] = new int[1];
		arrays[1] = new int[4];
		arrays[2] = new int[] { 10, 11, 2, 3, 4 };
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print("\t" + arrays[i][j]);
			}
			System.out.println();
		}

		for (int[] is : arrays) {
			for (int i : is) {
				System.out.print("\t" + i);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printExplicitos();
		// int arrays[][] = { { 1 }, { 2, 2 }, { 4, 4, 5, 6, 7, 8, 9 }, { 5, 5 }
		// };
		// for (int[] array : arrays) {
		// for (int value : array) {
		// System.out.print("\t " + value);
		// }
		// System.out.println();
		// }
	}
}

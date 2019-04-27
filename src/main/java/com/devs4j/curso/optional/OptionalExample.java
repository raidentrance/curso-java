package com.devs4j.curso.optional;

import java.util.Optional;

public class OptionalExample {

	public static Integer findNotOptionalValue(Integer value, Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return null;
	}

	public static Optional<Integer> findValue(Integer value, Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return Optional.of(i);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		Optional<Integer> result = findValue(5, new Integer[] { 10, 33, 23, 57, 88, 54, 34, 246, 7, 7, 34, 34 });
		if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("No se encontro el resultado");
		}
	}
}

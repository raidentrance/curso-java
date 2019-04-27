package com.devs4j.curso.lambdas;

interface Calculable {
	double avg(double... numbers);
}

public class InterfaceImplementation {
	public static void main(String[] args) {
		Calculable calc = (numbers) -> {
			double sum = 0.0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			return sum / numbers.length;
		};
		System.out.println(calc.avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
	}
}

package com.devs4j.curso.wrapper;

public class UsefulMethods {
	public static void main(String[] args) {
		Integer val = new Integer(11);
		double doubleValue = val.doubleValue();
		System.out.println(doubleValue);

		int intValue = Integer.parseInt("11");
		System.out.println(intValue);

		Double doubleValue2 = Double.valueOf("3.14");
		System.out.println(doubleValue2);

		Integer x = 10;
		int y = x;

		System.out.println(y);

		Integer i1 = 1000;
		Integer i2 = 1000;
		if (i1 != i2) {
			System.out.println("Objetos diferentes");
		}
		if (i1.equals(i2)) {
			System.out.println("Objetos equivalentes");
		}
	}
}

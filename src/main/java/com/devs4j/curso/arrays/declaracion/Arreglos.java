package com.devs4j.curso.arrays.declaracion;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		int arreglo[]={10,30,40,80,100,1000,2000,4000};
		int result = Arrays.binarySearch(arreglo, 80);
		System.out.println(result);
		int arreglo2[][]={};
		System.out.println(arreglo2.getClass());
		
	}
}

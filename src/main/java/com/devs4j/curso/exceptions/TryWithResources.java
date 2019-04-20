package com.devs4j.curso.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		/**
		 * Uso simple de try with resources
		 */
		try (PrintWriter writer = new PrintWriter(new File("src/main/resources/test.txt"))) {
			writer.println("Hello World");
		} catch (FileNotFoundException e) {
			// Manejo de la excepción
		}

		
		/**
		 * Try with resources con multiples recursos
		 */
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
				PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// Manejo de la excepción
		}
	}
}

package com.devs4j.curso.exceptions.files;

import java.io.File;

public class ManejadorDeArchivos {
	public static void main(String[] args) {
		File file=new File("/");
		System.out.println(file.getAbsolutePath());
		
		File[] files= file.listFiles();
		
		for (File f : files) {
			System.out.println(f.getName());
		}
		
	}
}

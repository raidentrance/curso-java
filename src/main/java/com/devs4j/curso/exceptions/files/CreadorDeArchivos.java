package com.devs4j.curso.exceptions.files;

import java.io.File;
import java.io.IOException;

public class CreadorDeArchivos {
	public static void main(String[] args) {
		File f=new File("src/main/resources/ejemplo.txt");
		System.out.println(f.exists());
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				System.out.println("Siempre se ejecuta");
			}
		}
	}
}

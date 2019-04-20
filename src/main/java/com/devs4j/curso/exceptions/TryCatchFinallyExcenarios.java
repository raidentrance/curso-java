package com.devs4j.curso.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class TryCatchFinallyExcenarios {
	public static void main(String[] args) {
		try {

		} catch (Exception e) {

		}

		try {

		} finally {

		}

		try {
			File f = new File("");
			f.createNewFile();
		} catch (FileNotFoundException | FileAlreadyExistsException e) {

		} catch (IOException e) {
		}
	}
}

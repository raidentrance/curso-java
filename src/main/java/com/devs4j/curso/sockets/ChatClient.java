package com.devs4j.curso.sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	public static String leer(String message) throws IOException {
		System.out.println(message);
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		try (Socket socket = new Socket("localhost", 8080);
				DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());) {
			String mensaje = null;
			do {
				mensaje = leer("->");
				dataOutput.writeUTF(mensaje);
			} while (!mensaje.equals("salir"));
		}
	}
	
}

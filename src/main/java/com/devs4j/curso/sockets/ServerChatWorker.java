package com.devs4j.curso.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerChatWorker extends Thread {
	private Socket client;

	public ServerChatWorker(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		System.out.println(String.format("Mensajes del cliente %s", client.getInetAddress().getHostAddress()));
		String message = null;
		try (DataInputStream data = new DataInputStream(client.getInputStream())) {
			do {
				message = data.readUTF();
				System.out.println(String.format("%s Dice:  %s", client.getInetAddress().getHostAddress(), message));
			} while (!message.equals("salir"));
		} catch (IOException e) {
			System.err.println("Error attending request");
		}
	}
	
}

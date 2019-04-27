package com.devs4j.curso.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
	public static void main(String[] args) throws IOException {
		try (ServerSocket server = new ServerSocket(8080);) {
			do {
				System.out.println("Escuchando peticiones");
				Socket client = server.accept();
				System.out.println("Petición recibida atendiendo cliente");
				new ServerChatWorker(client).start();
			} while (true);
		}

	}
}

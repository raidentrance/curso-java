package com.devs4j.curso.threads.simple;

import java.util.Random;

class NumersThread extends Thread {
	public NumersThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

}

public class ThreadMethods {
	public static void main(String[] args) throws InterruptedException {

		Thread hilo1 = new NumersThread("Rosko");
		Thread hilo2 = new NumersThread("Mocho");
		hilo1.start();

		hilo2.start();
		
		hilo1.join();
		hilo2.join();
		System.out.println("End ");
	}
}
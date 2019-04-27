package com.devs4j.curso.lambdas;

public class ThreadUsingLambdas {
	public static void main(String[] args) {
		Runnable counter = () -> {
			for (int i = 0; i <= 100; i++) {
				try {
					Thread.sleep(800);
					System.out.println("Asc : " + i);
				} catch (InterruptedException e) {
					System.err.println(e);
				}
			}
		};
		new Thread(counter).start();
	}
}

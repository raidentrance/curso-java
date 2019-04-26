package com.devs4j.curso.threads.simple;

class DescendingCounter extends Thread {
	private int maxNumber;

	public DescendingCounter(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {
		for (int i = maxNumber; i >= 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("Descending : " + i);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}

class AscendingCounter implements Runnable {
	private int maxNumber;

	public AscendingCounter(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {
		for (int i = maxNumber; i >= 0; i--) {
			try {
				Thread.sleep(800);
				System.out.println("Ascending : " + i);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}

public class Counters {
	public static void main(String[] args) {
		DescendingCounter descending = new DescendingCounter(10);
		Thread ascending = new Thread(new AscendingCounter(10));
		descending.start();
		ascending.start();
		System.out.println("End of creation");
	}
}

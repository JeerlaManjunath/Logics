package com.nt.threads;

public class EvenOrOddThread implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even::" + i);
			} else {
				System.out.println("Odd::" + i);
			}
		}
	}

	public static void main(String[] args) {

		EvenOrOddThread r = new EvenOrOddThread();

		Thread t1 = new Thread(r);

		t1.start();
	}

}

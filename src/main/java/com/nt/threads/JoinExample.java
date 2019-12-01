package com.nt.threads;

class MyThreads extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

}

public class JoinExample {

	public static void main(String[] args) {

		MyThreads mt = new MyThreads();
		mt.setName("raja");
		System.out.println(mt.getName());
		mt.start();

		MyThreads mt2 = new MyThreads();
		mt2.setName("rani");
		System.out.println(mt2.getName());
		mt2.start();

		try {
			mt.join();
			//mt2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

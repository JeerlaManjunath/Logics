package com.nt.threads;

class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("Yeild method");
	}

}

public class YeildExample {

	public static void main(String[] args) {
		
		System.out.println("main start");

		MyThread m = new MyThread();

		Thread t = new Thread(m);
		//t.setPriority(10);
		
		t.start();

		Thread.yield();
		System.out.println("main end");

	}

}

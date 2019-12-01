package com.nt.threads;

class First extends Thread {

	public static synchronized void fistMethod() {

		String name = Thread.currentThread().getName();

		System.out.println("First class thread name::" + name);
		Second.secondMethod();

	}
	
	@Override
	public void run() {
	System.out.println("second");
	}


}

class Second extends Thread {

	public static synchronized void secondMethod() {

		String name = Thread.currentThread().getName();

		System.out.println("second class thread::" + name);

		First.fistMethod();
	}
	
	@Override
	public void run() {
	System.out.println("first");
	}
	
}

public class DeadLockTest {

	public static void main(String[] args) {

		First f = new First();
		Thread t1 = new Thread(f);
		Second s = new Second();
		Thread t2 = new Thread(s);

		t1.start();
		t2.start();

	}

}

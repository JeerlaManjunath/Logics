package com.nt.threads;

public class InterThreadCommunication {

	int count = 0;
	boolean flag = true;

	public synchronized void produce() {
		try {

			while (true) {
				if (flag = true) {

					count=count+1;
					System.out.println("Produce::" + count);
					flag = false;
					notify();
					wait();
				} else {
					wait();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void consumes() {

		try {
			while (true) {
				if (flag = false) {
					wait();
				} else {
					System.out.println("Consumes:" + count);
					wait();
					notify();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		InterThreadCommunication ie = new InterThreadCommunication();
		Produces p = new Produces(ie);
		Consumes c = new Consumes(ie);
		p.start();
		c.start();

	}

}

class Produces extends Thread {

	InterThreadCommunication ie;

	public Produces(InterThreadCommunication ie) {
		this.ie = ie;
	}

	@Override
	public void run() {
		ie.produce();
	}
}

class Consumes extends Thread {

	InterThreadCommunication ie;

	public Consumes(InterThreadCommunication ie) {
		this.ie = ie;
	}

	@Override
	public void run() {
		ie.consumes();
	}
}
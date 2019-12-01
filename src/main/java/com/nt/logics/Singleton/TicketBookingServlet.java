package com.nt.logics.Singleton;

public class TicketBookingServlet implements Runnable {

	public void run() {
		PrinterUtil pu = null;
		pu = PrinterUtil.getInstance();
		System.out.println("Current Thread::" + Thread.currentThread().getName() + " HashCode::" + pu.hashCode());

	}

}

package com.nt.logics.Singleton;

public class MultiThreadTest {

	public static void main(String[] args) {
		TicketBookingServlet servlet = null;
		servlet = new TicketBookingServlet();
		Thread t1 = new Thread(servlet);
		Thread t2 = new Thread(servlet);
		t1.start();
		t2.start();
		
	}

}

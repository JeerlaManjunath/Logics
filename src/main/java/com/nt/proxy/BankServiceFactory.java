package com.nt.proxy;

public class BankServiceFactory {

	public static BankService getInstance(boolean RBIMonitoring) {
		BankService service = null;
		if (RBIMonitoring) {
			service = new BankServiceProxy();
		} else {
			service = new BankServiceImpl();
		}

		return service;

	}

}

package com.nt.proxy;

public class BankServiceProxy implements BankService {
	BankService service = null;

	public BankServiceProxy() {
		service = new BankServiceImpl();
	}

	public String withdraw(int acno, int amt) throws IllegalAccessException {
		if (amt >= 4000) {
			throw new IllegalAccessException("check the amount to be withdrawn");
		} else {
			return service.withdraw(acno, amt);
		}
	}

	public String deposit(int acno, int amt) {

		if (amt >= 200000) {
			System.out.println(amt = amt - (amt / 30) * 100);

			throw new IllegalArgumentException("amount is >=200000 30% is deducted");
		} else {
			return service.deposit(acno, amt);
		}
	}

}

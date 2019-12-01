package com.nt.proxy;

public class BankServiceImpl implements BankService {

	public String withdraw(int acno, int amt) {
		return "withdrawing amount " + amt + " account number " + acno;
	}

	public String deposit(int acno, int amt) {
		return "withdrawing amount " + amt + " account number " + acno;
	}

}

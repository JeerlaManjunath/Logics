package com.nt.proxy;

public interface BankService {

	public String withdraw(int acno, int amt) throws IllegalAccessException;

	public String deposit(int acno, int amt);

}

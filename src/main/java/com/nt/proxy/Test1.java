package com.nt.proxy;

public class Test1 {

	public static void main(String[] args) throws IllegalAccessException {
		BankService service = null;

		service = BankServiceFactory.getInstance(false);
		System.out.println(service.withdraw(10001, 200000));
		System.out.println(service.deposit(10001, 500000));

		System.out.println("======================================");

		service = BankServiceFactory.getInstance(true);
		System.out.println(service.withdraw(10001, 200000));
		System.out.println(service.deposit(10001, 500000));

	}

}

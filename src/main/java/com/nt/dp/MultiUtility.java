package com.nt.dp;

public class MultiUtility extends Car {
	private String seats;
	private String entertainment;

	@Override
	public void assemble() {
		System.out.println("MultiUtility car is assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("MultiUtility car is roadTest Completed");

	}

	@Override
	public void driving() {
		System.out.println("MultiUtility car is ready to driving");

	}

}

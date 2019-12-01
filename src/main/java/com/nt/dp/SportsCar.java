package com.nt.dp;

public class SportsCar extends Car {
	private String power;
	private String entertainment;

	@Override
	public void assemble() {
		System.out.println("sports car is assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("sports car is roadTest Completed");

	}

	@Override
	public void driving() {
		System.out.println("sports car is ready to driving");

	}

}




package com.nt.dp;

public class LuxuryCar extends Car {
	private String acType;
	private String entertainment;

	@Override
	public void assemble() {
		System.out.println("Luxury car is assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("Luxury car is roadTest Completed");

	}

	@Override
	public void driving() {
		System.out.println("Luxury car is ready to driving");

	}

}

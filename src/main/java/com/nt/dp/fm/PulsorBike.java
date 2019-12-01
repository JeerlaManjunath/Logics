package com.nt.dp.fm;

public class PulsorBike extends BajajBike {

	public PulsorBike() {
		engineCC = "180/220CC";
		gearCount = "5 manual";
	}

	@Override
	public void drive() {
		System.out.println("PulsorBike has " + engineCC + " and " + gearCount);
	}

}

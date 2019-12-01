package com.nt.dp.fm;

public class AvengerBike extends BajajBike {

	public AvengerBike() {
		engineCC = "150CC";
		gearCount = "5 manual";
	}

	@Override
	public void drive() {
		System.out.println("AvengerBike has " + engineCC + " and " + gearCount);
	}

}

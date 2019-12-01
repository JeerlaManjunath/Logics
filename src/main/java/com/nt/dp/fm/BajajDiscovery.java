package com.nt.dp.fm;

public class BajajDiscovery extends BajajBike {

	public BajajDiscovery() {
		engineCC = "150CC";
		gearCount = "4 manual";
	}

	@Override
	public void drive() {
		System.out.println("BajajDiscoveryBike has " + engineCC + " and " + gearCount);
	}

}

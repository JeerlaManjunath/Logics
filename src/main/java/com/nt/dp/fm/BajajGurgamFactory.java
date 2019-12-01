package com.nt.dp.fm;

public class BajajGurgamFactory extends BajajBikeFactory {

	@Override
	public BajajBike createBike(String type) {
		BajajBike bike = null;
		if (type.equalsIgnoreCase("avenger")) {
			bike = new AvengerBike();
		} else if (type.equalsIgnoreCase("pulsor")) {
			bike = new PulsorBike();
		}
		if (type.equalsIgnoreCase("discover")) {
			bike = new BajajDiscovery();
		}
		return bike;
	}

	@Override
	public void paint() {
		System.out.println("Bajajbike gurgam is painted");
	}

	@Override
	public void assemble() {
		System.out.println("Bajajbike gurgam is assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("Bajajbike gurgam is roadtested");

	}

}

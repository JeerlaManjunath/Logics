package com.nt.dp.fm;

public class BajajBikeNorthTest {

	public static void main(String[] args) {

		BajajBike bike = null;
		BajajBikeFactory factory = null;

		factory = new BajajChennaiFactory();
		bike = factory.orderBike("pulsor");
		bike.drive();

	}

}

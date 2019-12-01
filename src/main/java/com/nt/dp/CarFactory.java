package com.nt.dp;

public class CarFactory {

	public static Car getCar(String type) {
		Car car = null;
		if (type.equalsIgnoreCase("SportsCar")) {
			car = new SportsCar();
		} else if (type.equalsIgnoreCase("luxury car")) {
			car = new LuxuryCar();
		} else if (type.equalsIgnoreCase("multipurposeutilitycar")) {
			car = new MultiUtility();
		} else {
			throw new IllegalArgumentException("Invalid car");
		}
		car.assemble();
		car.roadTest();
		car.driving();
		return car;
	}

}

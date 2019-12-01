package com.nt.dp;

public class FactoryDPTest {

	public static void main(String[] args) {

		Car car1=null,car2=null,car3=null;
		car1=CarFactory.getCar("sportscar");
		System.out.println("-------------------------------------");
		car1=CarFactory.getCar("luxury car");
		System.out.println("-------------------------------------");
		car1=CarFactory.getCar("multipurposeutilitycar");
		System.out.println("-------------------------------------");
		
	
	}

}

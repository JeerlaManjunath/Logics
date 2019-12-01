package com.nt.dp.fm;

public abstract class BajajBikeFactory {
	
	
	public abstract void paint();
	
	public abstract void assemble();
	
	public abstract void roadTest();
	
	public abstract BajajBike createBike(String type); 
	
	public BajajBike orderBike(String type) {
		
		BajajBike bike=null;
		bike=createBike(type);
		assemble();
		paint();
		roadTest();
		return bike;
	}

	
}

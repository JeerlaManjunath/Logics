package com.nt.logics.Singleton;

public class MyInnerClassLazyInstantiationTest {

	public static void main(String[] args) {
		PrinterUtil1 pu1 = null, pu2 = null;
		pu1 = PrinterUtil1.getInstance();
		pu2 = PrinterUtil1.getInstance();
		System.out.println(pu1.hashCode() + " " + pu2.hashCode());
		System.out.println("pu1==pu2::" + (pu1 == pu2));

	}

}

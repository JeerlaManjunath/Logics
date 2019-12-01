package com.nt.logics.Singleton;

public class SimpleTest {

	public static void main(String[] args) {
		PrinterUtil pu1 = PrinterUtil.getInstance();
		PrinterUtil pu2 = PrinterUtil.getInstance();

		System.out.println("Hashcodes::" + pu1.hashCode() + " " + pu2.hashCode());
		System.out.println("pu1==pu2::" + (pu1 == pu2));
	}

}

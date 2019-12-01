package com.nt.logics.Singleton;

public class CloningTest {

	public static void main(String[] args) {

		// PrinterUtil pu1 = null, pu2 = null;
		PrinterUtil pu1 = PrinterUtil.getInstance();
		try {
			PrinterUtil pu2 = (PrinterUtil) pu1.clone();
			System.out.println(pu1.hashCode() + " " + pu2.hashCode());
			System.out.println("pu1==pu2::" + (pu1 == pu2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.nt.logics.Singleton;

public class PrinterUtil1 extends CommonUtil {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PrinterUtil1() {

	}

	public static PrinterUtil1 getInstance() {
		return MyInnerClass.instance;
	}

	private static class MyInnerClass {
		private static PrinterUtil1 instance = new PrinterUtil1();
	}

}

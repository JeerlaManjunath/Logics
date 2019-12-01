package com.nt.logics.Singleton;

import java.io.IOException;

public class PrinterUtil extends CommonUtil {

	private static final long SerialVersionUID=1524855;
	private static PrinterUtil instance = null;
	private static boolean isInstatiated = false;

	static {
		instance = new PrinterUtil();
	}

	private PrinterUtil() throws IllegalArgumentException {
		if (isInstatiated) {
			throw new IllegalArgumentException("Object Alredy been created!!!");
		}
		isInstatiated = true;
	}
//1.SimpleTest.java
	/*
	 * public static PrinterUtil getInstance() { if (instance == null) { instance =
	 * new PrinterUtil(); } return instance; }
	 */

//2.MultiThreadingTest.java(Method Level)

	/*
	 * public static synchronized PrinterUtil getInstance() { if (instance == null)
	 * { instance = new PrinterUtil(); } return instance;
	 * 
	 * }
	 */
//2.1 Block Level with double null checking
	/*
	 * public static PrinterUtil getInstance() { if (instance == null) {
	 * 
	 * synchronized (PrinterUtil.class) { if (instance == null) {
	 * 
	 * try { Thread.sleep(5000); } catch (Exception e) { e.printStackTrace(); }
	 * instance = new PrinterUtil(); } } } return instance;
	 * 
	 * }
	 */
// 3.CloningTest.java

	public static PrinterUtil getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					try {
						Thread.sleep(5000);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		return instance;

	}

	/*
	 * @Override public Object clone() throws CloneNotSupportedException { return
	 * instance; }
	 */

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("The singleton class has protected from cloning");
	}
	
	/*public Object readResolve() {
		
		return instance;
	
	}*/
	
	public Object readResolve() throws IOException {
	throw new IOException("Deserializtion is protected...");
	}
	
	

}

package com.nt.logics.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionAPITest {

	public static void main(String[] args) {
		PrinterUtil pu1 = null, pu2 = null;
		Class<?> c = null;
		Constructor<?> cons[] = null;
		pu1 = PrinterUtil.getInstance();
		try {
			c = Class.forName("com.nt.logics.Logicals.PrinterUtil");
			cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			pu2 = (PrinterUtil) cons[0].newInstance();

			System.out.println("Object is created through Reflection API");
			System.out.println(pu1.hashCode() + " " + pu2.hashCode());
			System.out.println("pu1==pu2::" + (pu1 == pu2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.nt.logics.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationTest {

	public static void doSerialization(Object obj) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		fos = new FileOutputStream("D://Serialization.ser");
		oos.writeObject(obj);
		oos = new ObjectOutputStream(fos);
		oos.flush();
		fos.close();
		oos.close();
		System.out.println("Serialization Completed...");

	}

	public static Object doDeserialization() throws IOException, ClassNotFoundException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		fis = new FileInputStream("D://Serialization.ser");
		ois = new ObjectInputStream(fis);
		obj = ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Deserialization Completed...");
		return obj;
	}

	public static void main(String[] args) {

		/*
		 * PrinterUtil pu1 = null, pu2 = null; pu1 = PrinterUtil.getInstance(); try {
		 * DeserializationTest.doSerialization(pu1); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); System.out.println("Problem in serializtion"); }
		 * 
		 */

		PrinterUtil pu1 = null, pu2 = null;
		pu1 = PrinterUtil.getInstance();
		try {
			pu2 = (PrinterUtil) DeserializationTest.doDeserialization();
			System.out.println(pu1.hashCode()+ " " + pu2.hashCode());
			System.out.println("pu1==pu2::" + (pu1 == pu2));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problem in deserialization");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problem in deserialization");
		}
	}
}

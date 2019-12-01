package com.nt.logicals;

public class BinaryToDecimaltest {

	public static void main(String[] args) {

		int binary = 1010;

		int decimal = (int) Math.pow(binary, 2);
		for (int i = 0; i <= binary; i++) {

			binary = binary % 10;

		}
		System.out.println(decimal);

	}

}

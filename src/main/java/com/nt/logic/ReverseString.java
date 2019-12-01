package com.nt.logic;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String original = null, reverse = "";
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.println("Enter name::");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse::" + reverse);

	}

}

package com.nt.logicals;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = null, reverse = "";
		System.out.println("Enter original String");
		original = sc.nextLine();
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse String is::" + reverse);

	}

}

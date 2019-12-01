package com.nt.logicals;

import java.util.Scanner;

public class ReverseEachWords {

	public static void main(String[] args) {

		String orinalString = null, output = "", words[] = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		orinalString = sc.nextLine();
		words = orinalString.split(" ");
		/*
		 * for (String word : words) { String reverseString = ""; for (int i =
		 * word.length() - 1; i >= 0; i--) { reverseString = reverseString +
		 * word.charAt(i); } output = output + reverseString + " "; }
		 * System.out.println(output);
		 */

		for (String word : words) {
			String reverseString = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				reverseString = reverseString + word.charAt(i);
			}
			output = output + reverseString + " ";
		}
		System.out.println(output);
	}
}

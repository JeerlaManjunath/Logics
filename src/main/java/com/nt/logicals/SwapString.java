package com.nt.logicals;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();

		firstName = firstName + lastName;
		lastName = firstName.substring(0, firstName.length() - lastName.length());
		firstName = firstName.substring(lastName.length());

		System.out.println("fitstName::" + firstName + " lastName::" + lastName);
	}

}

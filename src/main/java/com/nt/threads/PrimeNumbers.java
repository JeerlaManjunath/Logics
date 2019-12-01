package com.nt.threads;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			int flag = 1;
			for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}

			}
			if (flag == 1) {
				System.out.print(i + " ");
			}
		}
	}
}

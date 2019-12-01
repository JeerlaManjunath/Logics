package com.nt.logicals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix3X3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[][] = new int[3][3];

		String m;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements for 3X3 matrix");

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				m = br.readLine();
				a[i][j] = Integer.parseInt(m);

			}
		}

		System.out.println("elements of 3X3 matrix");
		System.out.println();

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				System.out.println(a[i][j]);
			}
			System.out.println();
		}

	}

}

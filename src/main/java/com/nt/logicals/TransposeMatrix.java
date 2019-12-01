package com.nt.logicals;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.println("Enter total no.of rows and columns");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();

		int array[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = sc.nextInt();
				System.out.println();
			}
		}

		System.out.println("Matrix before transpose");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(array[i][j]);
				System.out.println();
			}
		}
		System.out.println("Matrix after transpose");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println(array[i][j]);
				System.out.println();
			}
		}
	}

}

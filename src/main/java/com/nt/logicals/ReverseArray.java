package com.nt.logicals;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] temp = new int[5];

		for (int i = 0; i < 5; i++) {
			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		/*
		 * for (int i = arr1.length-1; i >= 0; i--) { System.out.println(arr1[i]); }
		 * 
		 * System.out.println("reverse::" + Arrays.toString(arr1));
		 */
	}

}

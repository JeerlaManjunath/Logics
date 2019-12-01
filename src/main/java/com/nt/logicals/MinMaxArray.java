package com.nt.logicals;

public class MinMaxArray {

	public static void findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	public static void findMin(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 15, 10, 18, 35 };
		findMax(input);
		findMin(input);

	}

}

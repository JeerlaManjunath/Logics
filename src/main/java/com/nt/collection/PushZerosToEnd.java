package com.nt.collection;

import java.util.Arrays;

public class PushZerosToEnd {

	public static void main(String[] args) {

		int[] a = { 1, 2, 0, 1, 2, 0, 1, 0, 0, 2, 3 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = n - 1; i > 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));

	}

}

package com.nt.ds;

public class QuicksortDemo {

	int[] a;
	int length;

	public void sort(int[] arr) {
		a = arr;
		length = arr.length;
		quicksort(0, length - 1);

	}

	private void quicksort(int lb, int ub) {
		int start = lb;
		int end = ub;

		int pivot = a[0];
		while (start <= end) {
			while (a[start] < pivot) {
				start++;
			}
			while (a[end] > pivot)
				end--;
		}

		if (start < end) {

			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

		}

	}

	public static void main(String[] args) {

		int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };

		for (int i = 0; i < unsorted.length - 1; i++) {

			System.out.println(unsorted[i]);

		}
		QuicksortDemo demo = new QuicksortDemo();
		demo.sort(unsorted);

		for (int i = 0; i < unsorted.length - 1; i++) {

			System.out.println(unsorted[i]);

		}

	}
}

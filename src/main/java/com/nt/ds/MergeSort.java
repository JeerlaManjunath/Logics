package com.nt.ds;

import java.util.Arrays;

public class MergeSort {

	int a[];
	int temp[];
	int length;

	public void sort(int[] arr) {

		this.a = arr;
		this.length = arr.length;
		this.temp = new int[length];

		mergeSort(0, length - 1);

	}

	public void merge(int lb, int mid, int ub) {
		int i = lb;
		int j = mid + 1;
		int k = lb;
		while (i <= mid && j <= ub) {
			if (a[i] <= a[j]) {
				temp[k] = a[i];
				i++;
			} else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}
	}

	public void mergeSort(int lb, int ub) {

		if (lb < ub) {
			int mid = (lb+ub)/2;
			mergeSort(lb, mid);
			mergeSort(mid + 1, ub);
			merge(lb, mid, ub);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 0, 5 };
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

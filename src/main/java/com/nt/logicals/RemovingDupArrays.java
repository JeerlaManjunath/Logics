package com.nt.logicals;

import java.util.HashSet;
import java.util.Set;

public class RemovingDupArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 2, 1, 2, 3 };
		int count = 0;

		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : a) {
			if (set.add(a[i]) == false) {
				count++;
				System.out.println("duplicates are::" + i + " count" + count);
			}
		}

	}

}

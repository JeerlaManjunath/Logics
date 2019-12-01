package com.nt.logicals;

public class CountDuplicates {

	public static void main(String[] args) {
		String name = "rajarani";
		int count = 0;
		char[] input = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (input[i] == input[j]) {
					System.out.println(input[j]);
					count++;
				}
			}

		}

		System.out.println(count);

	}

}

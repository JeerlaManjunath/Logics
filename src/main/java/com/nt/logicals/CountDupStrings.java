package com.nt.logicals;

import java.util.HashSet;

public class CountDupStrings {

	public static void main(String[] args) {
		int count = 0;
		String[] names = { "java", "python", "java", "python" };
		/*
		 * for (int i = 0; i < names.length; i++) { for (int j = i + 1; j <
		 * names.length; j++) { if (names[i].equals(names[j])) { count++;
		 * 
		 * System.out.println(names[j] + " " + count); } }
		 * 
		 * }
		 */

		HashSet<String> set = new HashSet<String>();
		for (String name : names)
			if (set.add(name) == false) {
				count++;
				System.out.println("duplicates::" + name + " count::" + count);

			}

	}

}

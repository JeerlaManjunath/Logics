package com.nt.logicals;

import java.util.HashMap;

public class StringOccurances {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String[] arr = { "raja", "rani", "raja" };

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				int value = map.get(str);
				map.put(str, value + 1);
			}
		}
		System.out.println(map);
		// System.out.println(Arrays.toString(arr));

	}

}

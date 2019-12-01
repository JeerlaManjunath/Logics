package com.nt.logicals;

import java.util.HashMap;
import java.util.Scanner;

public class CharOccurances {

	public static void main(String[] args) {

		String name = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		name = sc.nextLine();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] character = name.toCharArray();
		for (char ch : character) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
	}

}

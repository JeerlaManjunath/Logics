package com.nt.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "raja");
		hm.put(102, "rani");

		for (Entry<Integer, String> map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

}

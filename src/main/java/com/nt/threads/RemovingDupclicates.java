package com.nt.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDupclicates {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 2, 1, 2, 3, 3, 4, 5, 6));
		// LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		// System.out.println(lhs);

		List<Object> l = al.stream().distinct().collect(Collectors.toList());

		System.out.println(l);
	}

}

package com.nt.sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {

		// return o1.age > o2.age ? -1 : o1.age < o2.age ? 1 : 0;
		return o1.age > o2.age ? 1 : o1.age < o2.age ? -1 : 0;
	}

}

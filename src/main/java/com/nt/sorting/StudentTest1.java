package com.nt.sorting;

import java.util.TreeSet;

public class StudentTest1 {

	public static void main(String[] args) {
		TreeSet<Student> st1 = new TreeSet<Student>(new AgeComparator());

		Student s1 = new Student(101, "raja", 28);
		Student s2 = new Student(102, "rani", 25);
		Student s3 = new Student(103, "vani", 21);

		st1.add(s1);
		st1.add(s2);
		st1.add(s3);

		System.out.println(st1);
	}

}

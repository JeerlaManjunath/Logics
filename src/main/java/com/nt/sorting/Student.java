package com.nt.sorting;

public class Student {

	public int id;
	public String name;
	public int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {

		return "Student[ " + id + " " + name + " " + age + "]";

	}
}

package com.nt.sorting;

import java.util.TreeSet;

public class StudentTest implements Comparable<StudentTest> {

	private int id;
	private String name;
	private int age;

	public StudentTest(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentTest st) {

		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student[ " + id + " " + name + " " + age + "]";
	}


	public static void main(String[] args) {
		/*ArrayList<StudentTest> al = new ArrayList<StudentTest>();
		StudentTest st1 = new StudentTest(103, "raja", 28);
		StudentTest st2 = new StudentTest(101, "raja", 25);

		al.add(st1);
		al.add(st2);

		Collections.sort(al);
		// Collections.sort(al, Collections.reverseOrder());
		for (StudentTest std : al) {
			System.out.println(std);
		}

		Collections.reverseOrder();

		System.out.println(al);

	}
*/
		TreeSet<StudentTest> st=new TreeSet<StudentTest>();
		st.add(new StudentTest(103, "raja", 28));
		st.add(new StudentTest(101, "rani", 25));
		st.add(new StudentTest(102, "vani", 24));
		
		System.out.println(st);
	}
}

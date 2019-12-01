package com.nt.strategyDP;

public class StudentFactory {

	public static Student getInstance(String type) {
		Student st = null;
		CourseMaterial material = null;
		// create target class object
		st = new Student();

		// create dependent class object
		if (type.equalsIgnoreCase("java")) {
			material = new JavaCourseMaterial();
		} else if (type.equalsIgnoreCase("python")) {
			material = new PythonCourseMaterial();
		} else if (type.equalsIgnoreCase("testing")) {
			material = new TestingCourseMaterial();
		} else {
			throw new IllegalArgumentException("Invalid type");
		}
		// Injection dependent class object to target class
		st.setMaterial(material);
		return st;

	}

}

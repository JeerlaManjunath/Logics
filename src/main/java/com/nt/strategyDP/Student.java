package com.nt.strategyDP;

public class Student {

	private CourseMaterial material;

	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}

	public void prepareForJob() {
		String knowledge = null;
		knowledge = material.courseContent();
		System.out.println("Attending " + knowledge + " course");
		System.out.println("searching for job.....");

	}

}

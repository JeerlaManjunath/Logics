package com.nt.strategyDP;

public class Test {

	public static void main(String[] args) {
		Student st = null;
		// create target class object
		st = StudentFactory.getInstance("java");
		st.prepareForJob();
	}

}

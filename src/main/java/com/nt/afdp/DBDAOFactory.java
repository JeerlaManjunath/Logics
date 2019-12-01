package com.nt.afdp;

public class DBDAOFactory implements DAOFactory {

	public DAO getInstance(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("Student")) {
			dao = new StudentDBDAO();
		} else if (type.equalsIgnoreCase("Course")) {
			dao = new CourseDBDAO();
		} else {
			throw new IllegalArgumentException("invalid type");
		}
		return dao;
	}

}

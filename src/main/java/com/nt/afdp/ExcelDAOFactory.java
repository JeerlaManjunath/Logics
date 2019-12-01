package com.nt.afdp;

public class ExcelDAOFactory implements DAOFactory {

	public DAO getInstance(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("Student")) {
			dao = new StudentExcelDAO();
		} else if (type.equalsIgnoreCase("Course")) {
			dao = new CourseExcelDAO();
		} else {
			throw new IllegalArgumentException("invalid type");
		}
		return dao;
	}

}

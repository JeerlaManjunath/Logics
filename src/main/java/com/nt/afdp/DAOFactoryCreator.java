package com.nt.afdp;

public class DAOFactoryCreator {

	public static DAOFactory buildDAOFactory(String type) {
		DAOFactory factory = null;
		if (type.equalsIgnoreCase("DB")) {
			factory = new DBDAOFactory();
		} else if (type.equalsIgnoreCase("Excel")) {
			factory = new ExcelDAOFactory();
		} else {
			throw new IllegalArgumentException("Invalid type");
		}
		return factory;

	}

}

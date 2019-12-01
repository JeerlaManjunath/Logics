package com.nt.afdp;

public class Test {

	public static void main(String[] args) {

		DAO stDAO = null, courseDAO = null;
		DAOFactory factory = null;
		factory = DAOFactoryCreator.buildDAOFactory("db");
		stDAO = factory.getInstance("student");
		System.out.println("-------------------------------------");
		courseDAO = factory.getInstance("course");

		stDAO.insert();
		courseDAO.insert();

	}
}
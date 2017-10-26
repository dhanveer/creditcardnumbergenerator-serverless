package com.capitalone.examples.microservice.creditcardnumbergenerator.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * SYSTEM VARIABLES 
 * 
 * 1. DB_USER_NAME
 * 
 * 2. DB_PASSWORD
 * 
 * 3. PG_DB_NONPROD
 * 
 * 
 * @author Dhanveer
 *
 */
	
	


public  class DatabaseConnection {
	
	public static void main(String[] argv) {
		Connection connection = getDatabaseConnection();
	}
	
	public static Connection getDatabaseConnection(){
		
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return null;

		}

		System.out.println("POSTGRES JDBC DRIVER REGISTERRED!");

		
		Connection connection = null;

		try {
			String database_hostname = System.getenv().get("PG_DB_NONPROD");
			String  datbase_url="jdbc:postgresql://"+database_hostname+"/serverlessdemodb";
			System.out.println("DATABASE FULL URL : {}"+ datbase_url);
	       
			connection = DriverManager.getConnection(datbase_url.toString(), System.getenv().get("DB_USER_NAME").toString(),System.getenv().get("DB_PASSWORD").toString());
			//connection = DriverManager.getConnection(
				//	"jdbc:postgresql://credit-card-generator.cogwkqrz6pjz.us-east-1.rds.amazonaws.com:5432/serverlessdemodb", "demouser",
				//	"Topgear007");
		} catch (SQLException e) {

			System.out.println("DATABASE CONNECTION FAILED!!!");
			e.printStackTrace();
			return connection;

		}

		if (connection != null) {
			System.out.println("DATABASE CONNECTED SUCCESSFULLY!!!");
		} else {
			System.out.println("FAILED TO MAKE DATABASE CONNECTION!!!");
		}
		
		return connection;
	} 
	
}

package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert1 {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		
		try {
			openConnection();
			query="Insert into user values(3,'suresh','suresh@gmail.com','suresh@123')";
			statement= connection.createStatement();
			statement.execute(query);
			System.out.println("data inserted");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
		try {
			closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	public static void openConnection() throws SQLException {
		Driver driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
	}
	
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		if(statement!=null) {
			statement.close();
		}
		DriverManager.deregisterDriver(driver);
		
	}
}

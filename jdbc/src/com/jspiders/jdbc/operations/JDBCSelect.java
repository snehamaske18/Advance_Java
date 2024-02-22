package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {

	private static Connection connection;
	private static Statement statement;
	private static String query;
	private static ResultSet resultSet;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement= connection.createStatement();
			query="Select *from user";
			statement.execute(query);
			resultSet= statement.getResultSet();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
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
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4","root","root");
		
	}
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		if(statement!=null) {
			statement.close();
		}
	}
}

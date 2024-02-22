package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement= connection.createStatement();
			query="DELETE FROM user WHERE userid= 3";
			int res=statement.executeUpdate(query);
			System.out.println("user deleted");
			System.out.println(res);
		} catch (Exception e) {
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
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
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

package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			statement= connection.createStatement();
			query="UPDATE username=ganesh FROM user WHERE userid=3";
			boolean res=statement.execute(query);
			System.out.println("data updated");
			System.out.println(res);
		} catch (Exception e) {
			
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
	 connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4","root","root");
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

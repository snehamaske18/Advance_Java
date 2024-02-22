package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSearch {

	private static Connection connection;
	private static Statement statement;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="SELECT * FROM student WHERE name LIKE '%esh'";
			statement.executeQuery(query);
			resultSet= statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(2));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
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
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
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

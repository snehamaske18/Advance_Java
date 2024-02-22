package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSelect3 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter user id");
		int id=scanner.nextInt();
		scanner.close();
		
		query="SELECT * FROM user WHERE userid= ?";
		try {
			openConnection();
			preparedStatement= connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}else
				System.out.println("user not found");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4", "root", "root");
	}
	public static void closeConnection() throws SQLException {
		if(resultSet!=null) {
			resultSet.close();
		}
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
		if(connection!=null) {
			connection.close();
		}
	}
	
}

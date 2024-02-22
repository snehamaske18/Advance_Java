package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert2 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter user id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter user name");
		String name=scanner.nextLine();
		System.out.println("Enter user email");
		String email=scanner.nextLine();
		System.out.println("Enter password");
		String password=scanner.nextLine();
		
		
		try {
			openConnection();
			query="INSERT INTO user VALUES(?,?,?,?)";
			preparedStatement= connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4,password );
			int res=preparedStatement.executeUpdate();
			System.out.println(res+" row(s) are affected!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void openConnection() throws SQLException {
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4", "root","root");
	}
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
	}
}

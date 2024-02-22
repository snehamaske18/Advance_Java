package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert5 {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	
	public static void main(String[] args) {
		
		try {
			openConnection();
			query="insert into user values (?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			Scanner scanner=new Scanner(System.in);
			System.out.println("How many record you want to execute?");
			int num=scanner.nextInt();
			
			for(int i=1;i<=num;i++) {
				System.out.println("enter user id");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("enter user name");
				String name=scanner.nextLine();
				System.out.println("Enter user email");
				String email=scanner.nextLine();
				System.out.println("Enter password");
				String password=scanner.nextLine();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4,password );
				preparedStatement.addBatch();
			}
		int arr[]=	preparedStatement.executeBatch();
		System.out.println(arr.length +" row(s) affected");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void openConnection() throws SQLException {
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
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

package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCLoginSignup {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void signUp(Scanner scanner) {
		
		System.out.println("Enter user id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter user name");
		String name=scanner.nextLine();
		System.out.println("Enter user Email");
		String email=scanner.nextLine();
		System.out.println("Enter user Password");
		String password=scanner.nextLine();
		
		try {
			openConnection();
			query="insert into user values(?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res=preparedStatement.executeUpdate();
			if (res==1) {
				System.out.println("signed up");
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
     public static void logIn(Scanner scanner) {
         scanner.nextLine();
 		System.out.println("Enter user Email");
 		String email=scanner.nextLine();
 		System.out.println("Enter user Password");
 		String password=scanner.nextLine();
 		
 		try {
 			openConnection();
 			query="select *from user where useremail=? and userpassword=?";
 			preparedStatement=connection.prepareStatement(query);
 			preparedStatement.setString(3, email);
 			preparedStatement.setString(4, password);
 			 resultSet=preparedStatement.executeQuery();
 			if (resultSet.next()) {
 				System.out.println("Logged in");
 			} else {
 				System.out.println("Invalid email or password");
 			}
 		} catch (Exception e) {
 			// TODO: handle exception
 		} finally {
 			try {
 				closeConnection();
 			} catch (SQLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
		
	}
     private static void openConnection() throws SQLException {
    	 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
     }
     private static void closeConnection() throws SQLException {
    	 if(preparedStatement!=null) {
    		 preparedStatement.close();
    	 }
    	 if(connection!=null) {
    		 connection.close();
    	 }
     }
}

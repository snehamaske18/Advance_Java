package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete2 {
private static Connection connection;
private static PreparedStatement preparedStatement;
private static String query;

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter id to delete data");
	int id=scanner.nextInt();
	scanner.close();
	
	try {
		openConnection();
		query="delete from user where userid=?";
		preparedStatement= connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		int res=preparedStatement.executeUpdate();
		if(res==1) {
		System.out.println("user is deleted");
		}
		else
			System.out.println("user not found");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
			closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public static void openConnection() throws SQLException {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
}
public static void closeConnection() throws SQLException {
	if(preparedStatement!=null) {
		preparedStatement.close();
	}
	if(connection!=null) {
		connection.close();
	}
}
}

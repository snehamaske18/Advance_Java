package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert3 {
private static Connection connection;
private static Statement statement;
private static String query;

public static void main(String[] args) {
	
	try {
		openConnection();
		statement=connection.createStatement();
		query= "insert into student values(5,'vijay','vijay@gmail.com','27')";
		statement.execute(query);
		System.out.println("data inserted");
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

package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {

	public static void main(String[] args) throws SQLException {
		//load driver
		Driver driver= new com.mysql.cj.jdbc.Driver();
		
		//register
		DriverManager.registerDriver(driver);
		
		//open connection
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&password=root");
		
		//create statement
		
		Statement statement= connection.createStatement();
		
		//execute statement
		statement.execute("Insert into user values(1,'Ramesh','ramesh@gmail.com','ramesh123')");
		
		//process the result
		System.out.println("data inserted");
		
		//close connections
		
		statement.close();
		connection.close();
		
		//deregister the driver
		DriverManager.deregisterDriver(driver);
	}
	
}

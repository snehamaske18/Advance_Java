package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCSelect2 {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="SELECT * FROM user WHERE id= 2";
			resultSet= statement.executeQuery(query);
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
			
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
	
	public static void openConnection() throws IOException, SQLException {
		File file=new File("D:/file/db_info.txt");
		FileReader  fileReader= new FileReader(file);
		Properties properties=new Properties();
		properties.load(fileReader);
		connection= DriverManager.getConnection(properties.getProperty("url"), properties);
		
	}
	
	public static  void closeConnection() throws SQLException {
		if(resultSet!=null) {
			resultSet.close();
		}
		if(connection!=null) {
			connection.close();
		}
		if(statement!=null) {
			statement.close();
		}
	}
}

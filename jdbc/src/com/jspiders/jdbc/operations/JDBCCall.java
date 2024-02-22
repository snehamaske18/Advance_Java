package com.jspiders.jdbc.operations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCall {
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		
		try {
			openConnection();
			query="call sort()";
			callableStatement=connection.prepareCall(query);
			callableStatement.execute();
			resultSet= callableStatement.getResultSet();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
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
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weaj4?user=root&&password=root");
	}
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		if(callableStatement!=null) {
			callableStatement.close();
		}
	}
	
}

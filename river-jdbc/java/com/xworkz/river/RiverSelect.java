package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String URL = "jdbc:mysql://localhost:3306/xworkz.db";
		String USERNAME = "root";
		String PASSWORD = "root";
		
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		Class.forName(DRIVER);
		
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		Statement statement = connection.createStatement();
		
		String sql="select * from  river WHERE R_NAME='KAVERI'";
		ResultSet result=statement.executeQuery(sql);
		System.out.println(result);
		result.next();//moves the cursor
		//getXXX
		int id=result.getInt(1);//column value by index , index starts from 1
		System.out.println("id "+id);
		String name=result.getString(2);
		System.out.println("name "+name);
		String origin=result.getString(3);
		System.out.println("origin "+origin);
		boolean polluted=result.getBoolean(4);
		System.out.println("polluted "+polluted);
		int damNo=result.getInt(5);
		System.out.println("damNo "+damNo);
		double length=result.getDouble(6);
		System.out.println("length "+length);
		connection.close();
	}
}
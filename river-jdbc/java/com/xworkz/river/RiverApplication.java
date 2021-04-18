package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverApplication {

public static void main(String[] args) throws ClassNotFoundException,SQLException
{
	//com.mysql.jdbc.driver=version is 5
	// com.mysql.cj.jdbc.Driver
	Class.forName("com.mysql.jdbc.Driver");
	//jdbc:mysql://localhost:3306/xworkz.db
	
Connection conn= 
DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db","root","root");
	if(conn!=null)
	{
		
	System.out.println("conncected to db,can follow next steps");
	Statement statement=conn.createStatement();
	String sqlQuery="INSERT INTO river VALUES(1,'KAVERI','KODAGU',0,8)";  
	int totalRowsAffected=statement.executeUpdate(sqlQuery);
	System.out.println("totalRowsAffected"+totalRowsAffected);
	}
	else{
	System.out.println("not comnnected");
	}
}	
}

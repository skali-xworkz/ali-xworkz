package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverUpdate {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{	
	
		Class.forName("com.mysql.jdbc.Driver");		
	Connection conn= 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db","root","root");
		if(conn!=null)
		{
			
		System.out.println("conncected to db,can follow next steps");
		Statement statement=conn.createStatement();
		//can we write multiple statments in single query using update command in java
		//String sqlQuery="update river set (R_ORIGIN='Talakaverii' where R_NAME='KAVERI'),(R_LENGTH=2500,R_DAM_NO=4 where R_NAME='Ganga' and R_ID=2),(R_POLLUTED=2 where R_ID=3),(R_ORIGIN='Amarkantak',R_POLLUTED=3,R_DAM_NO=7 where R_NAME='Narmada')";

		String sqlQuery="update river set R_ORIGIN='Talakaverii' where R_NAME='KAVERI'";
		String sqlQuery1="update river set R_LENGTH=2500,R_DAM_NO=4 where R_NAME='Ganga' and R_ID=2";
		String sqlQuery2="update river set R_POLLUTED=2 where R_ID=3";
		String sqlQuery3="update river set R_ORIGIN='Amarkantak',R_POLLUTED=3,R_DAM_NO=7 where R_NAME='Narmada'";
		int totalRowsAffected=statement.executeUpdate(sqlQuery);
		int totalRowsAffected1=statement.executeUpdate(sqlQuery1);
		int totalRowsAffected2=statement.executeUpdate(sqlQuery2);
		int totalRowsAffected3=statement.executeUpdate(sqlQuery3);
		System.out.println("totalRowsAffected "+totalRowsAffected);
		System.out.println("totalRowsAffected "+totalRowsAffected1);
		System.out.println("totalRowsAffected "+totalRowsAffected2);
		System.out.println("totalRowsAffected "+totalRowsAffected3);
		System.out.println("updated succesfully");
		}
		else{
		System.out.println("not connected");
		}
	}	
	}
	
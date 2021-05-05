package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.river.DBConstants;

public class FetchAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		double length=500;
		double length1=2000;
		//string concatenation
		String select="SELECT * FROM RIVER WHERE R_LENGTH>"+length+" and R_LENGTH>"+length;
		//String select = "SELECT * FROM RIVER";

		System.out.println("_____________River Details ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			int id = result.getInt(1);// column value by index , index starts  from 1
			System.out.println("id " + id);
			String name = result.getString(2);
			System.out.println("name " + name);
			String origin = result.getString(3);
			System.out.println("origin " + origin);
			boolean polluted = result.getBoolean(4);
			System.out.println("polluted " + polluted);
			int damNo = result.getInt(5);
			System.out.println("damNo " + damNo);
			double lengthh = result.getDouble(6);
			System.out.println("length " + lengthh);
			System.out.println("*******************");
		}
		
		}finally {
		connection.close();
		}
	}
}
// for understanding below code how to fetch the rows & don't copy below code
/*
 * boolean flag=resultset.next();//cursor will be move next line till the rows
 * System.out.println(flag);
 * 
 * flag=resultset.next(); System.out.println(flag);
 * 
 * flag=resultset.next(); System.out.println(flag);
 * 
 * flag=resultset.next(); System.out.println(flag);
 * 
 * flag=resultset.next(); System.out.println(flag);
 * 
 * flag=resultset.next(); System.out.println(flag); //FALSE
 */

/*
 * boolean flag=result.next();//cursor will be move next line till the rows
 * System.out.println(flag); int id=result.getInt(1);//column value by index ,
 * index starts from 1 System.out.println("id "+id); String
 * name=result.getString(2); System.out.println("name "+name); String
 * origin=result.getString(3); System.out.println("origin "+origin); boolean
 * polluted=result.getBoolean(4); System.out.println("polluted "+polluted); int
 * damNo=result.getInt(5); System.out.println("damNo "+damNo); double
 * length=result.getDouble(6); System.out.println("length "+length);
 */
	
	
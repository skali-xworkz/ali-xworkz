package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectMAXANDMIN {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		String select = "select max(R_LENGTH),min(R_LENGTH) from river";

		System.out.println("_____________River MAX(R_LENGTH)____MIN(R_LENGTH) ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			int length = result.getInt(1);// column value by index , index starts  from 1
			System.out.println("MAX(R_LENGTH) "+ length);
			System.out.println("*************");
			int length1 = result.getInt(2);
			System.out.println("MIN(R_LENGTH) "+ length1);
			
		}
		
		}finally {
		connection.close();
		}
	}
}

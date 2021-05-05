package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectNameLengthDam {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		String select = "select R_LENGTH,R_NAME,R_DAM_NO FROM river";

		System.out.println("_____________River Details ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			double lengthh = result.getDouble(1);
			System.out.println("length " + lengthh);
			
			String name = result.getString(2);
			System.out.println("name " + name);
			
			
		
			int damNo = result.getInt(3);
			System.out.println("damNo " + damNo);
			
			System.out.println("*******************");
		}
		
		}finally {
		connection.close();
		}
	}
}
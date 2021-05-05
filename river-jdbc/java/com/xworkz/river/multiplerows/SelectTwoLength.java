package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectTwoLength {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		
		String select = "select * from river where R_LENGTH >500 AND R_LENGTH < 1500;";

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

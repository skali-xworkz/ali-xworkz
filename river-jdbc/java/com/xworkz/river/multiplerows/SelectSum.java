package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectSum {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		String select = "select sum(R_DAM_NO) from river";

		System.out.println("_____________River sum(R_DAM_NO) ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			int dam = result.getInt(1);// column value by index , index starts  from 1
			System.out.println("sum(R_DAM_NO) "+ dam);
		}
		
		}finally {
		connection.close();
		}
	}
}

package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectTwoColumns {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		String select = "select R_ID,R_NAME from river where R_POLLUTED is true";

		System.out.println("_____________River Details ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			int id = result.getInt(1);// column value by index , index starts  from 1
			System.out.println("id " + id);
			String name = result.getString(2);
			System.out.println("name " + name);
			System.out.println("*******************");
		}
		
		}finally {
		connection.close();
		}
	}
}

package com.xworkz.river.multiplerows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.DBConstants;

public class SelectPollut {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBConstants.DRIVER);
		Connection connection=null;//resources
		try{
		 connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME,
				DBConstants.PASSWORD);

		Statement statement = connection.createStatement();
		
		String select = "select * from river where R_POLLUTED is true";

		System.out.println("_____________River Details ____________");
		ResultSet result = statement.executeQuery(select);
		// System.out.println(resultset);
		while (result.next()) {
			boolean polluted = result.getBoolean(4);
			System.out.println("polluted " + polluted);
		}
		
		}finally {
		connection.close();
		}
	}
}


package com.xworkz.river.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverSelectGivenThreeCondtions {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String URL = "jdbc:mysql://localhost:3306/xworkz.db";
		String USERNAME = "root";
		String PASSWORD = "root";
		
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		Class.forName(DRIVER);
		
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		Statement statement = connection.createStatement();
		
		String select = "select R_ID,R_LENGTH,R_POLLUTED FROM RIVER WHERE R_NAME='Ganga' and R_ORIGIN='Varanasi'";

		System.out.println("_____________River Details ____________");
		ResultSet resultset = statement.executeQuery(select);

		boolean next = resultset.next();
		System.out.println("The Given Condition is : " + next);
		int id = resultset.getInt(1);
		System.out.println("River ID  " + id);

		int dam = resultset.getInt(2);
		System.out.println("River Dams " + dam);

		int LENGTH = resultset.getInt(3);
		System.out.println("River Length  " + LENGTH);
		connection.close();

	}


}

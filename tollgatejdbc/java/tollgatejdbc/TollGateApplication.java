package tollgatejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TollGateApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db", "root", "root");
		if (conn != null) {
			System.out.println("conncected to SQL DataBase...Welcome to SQL DataBases");
			Statement statement = conn.createStatement();
			String sqlQuery =" insert into tollgate values(110,5,'Attibele','Silk Board Junction – Hosur'),(111,4,'Bagepalli','AP/ Karnataka Border – Devanhalli'),(112,6,'Bankapur','Gabbur – Devgiri '),(113,8,'Brahamarakotlu','B.C.Road – Padil & Padil'),(114,3,'Hoskote','Bangalore Kolar Mulbagal'),(115,5,'Mulbagal','Mulbagal-Kolar-Bangalore section');";
			int totalExecuted = statement.executeUpdate(sqlQuery);
			System.out.println("SQL QUERY EXECUTED "+totalExecuted);
		} else {
			System.out.println("not comnnected");
		}
	}
}


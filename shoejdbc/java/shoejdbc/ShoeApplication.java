package shoejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoeApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db", "root", "root");
		if (conn != null) {
			System.out.println("conncected to SQL DataBase...Welcome to SQL DataBases");
			Statement statement = conn.createStatement();
			String sqlQuery = "INSERT INTO shoe VALUES(101,'nike','red','7',10000),(102,'Adidas','black','9',5000),(103,'Clarks','white','8',7000),(104,'Seeandwear','Brown','6',8000),(105,' Woodland ','black','12',6000)";
			int totalExecuted = statement.executeUpdate(sqlQuery);
			System.out.println("SQL QUERY EXECUTED "+totalExecuted);
		} else {
			System.out.println("not comnnected");
		}
	}
}

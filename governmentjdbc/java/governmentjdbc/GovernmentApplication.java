package governmentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GovernmentApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db", "root", "root");
		if (conn != null) {
			System.out.println("conncected to SQL DataBase...Welcome to SQL DataBases");
			Statement statement = conn.createStatement();
			String sqlQuery =" insert into government values(1001,'bjp',99,'Pramod Pandurang Sawant'),(1002,'CPI',68,'Shripad Amrit Dange'),(1003,'NPP',75,'P. A. Sangma'),(1004,'NCP',88,'Sharad Pawar'),(1005,'INC',98,'William Wedderburn')";
			int totalExecuted = statement.executeUpdate(sqlQuery);
			System.out.println("SQL QUERY EXECUTED "+totalExecuted);
		} else {
			System.out.println("not comnnected");
		}
	}
}

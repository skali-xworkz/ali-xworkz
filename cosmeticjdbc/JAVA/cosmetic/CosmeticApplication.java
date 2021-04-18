package cosmetic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CosmeticApplication {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {

			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz.db", "root", "root");
			if (conn != null) {
				System.out.println("conncected to SQL DataBase...Welcome to SQL DataBases");
				Statement statement = conn.createStatement();
				String sqlQuery =" INSERT INTO cosmetic VALUES(10,'Creams','Himalaya Herbals Anti Hair Fall Shampoo',500),(11,'Lotions','Aveeno Skin Relief Moisturizing Lotion',956),(12,'Eyebrow','Lakme Combo Of Eyeliner And Eyebrow',644)";
				int totalExecuted = statement.executeUpdate(sqlQuery);
				System.out.println("SQL QUERY EXECUTED "+totalExecuted);
			} else {
				System.out.println("not comnnected");
			}
		}
	}
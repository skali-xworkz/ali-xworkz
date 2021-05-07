package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import dto.NewsChannelDTO;
import xworkz.DBConstants;

public class NewsChannelDAOImp implements NewsChannelDAO {

	@Override
	public void save(NewsChannelDTO dto) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("invoked DAO implementation\n" + dto);

		Class.forName(DBConstants.DRIVER);
		Connection connection = null;// resources
		try {
			connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME, DBConstants.PASSWORD);

			Statement statement = connection.createStatement();
			String sql = "INSERT INTO news_channel VALUES(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getOwner() + "','" + dto.getEditor() + "','" + dto.getLang() + "')";
			statement.executeUpdate(sql);
		} finally {
			connection.close();
		}	
	}

	@Override
	public void updateEditorByName(String editor, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName(DBConstants.DRIVER);
		Connection connection = null;// resources
		try {
			connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME, DBConstants.PASSWORD);
			Statement statement = connection.createStatement();
			String sql = "update news_channel set N_MAIN_EDITOR='"+editor+"' where N_NAME='"+name+"';";
			statement.executeUpdate(sql);
			System.out.println("updating Editor name succesfully changed..Check in SQL WorkBench");
		} finally {
			connection.close();
		}	
	}
		
	
	@Override
	public void deleteByName(String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName(DBConstants.DRIVER);
		Connection connection = null;// resources
		try {
			connection = DriverManager.getConnection(DBConstants.URL, DBConstants.USERNAME, DBConstants.PASSWORD);
			Statement statement = connection.createStatement();
			String sql ="delete from news_channel where N_NAME='"+name+"';";
			statement.executeUpdate(sql);
			System.out.println(" News_name succesfully ..Check in SQL WorkBench");
		} finally {
			connection.close();
		}	
	}

}
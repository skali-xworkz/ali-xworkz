package com.xworkz.xworkzapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.xworkzapp.DTO.TallestBuildingDTO;

public class TallestBuildingDAOImpl implements TallestBuildingDAO {
	String url = "jdbc:mysql://localhost:3306/xworkz.db";
	String user = "root";
	String password = "root";
	TallestBuildingDTO dto1 = new TallestBuildingDTO();

	public TallestBuildingDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(TallestBuildingDTO dto) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO  tallest_building VALUES(?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setDouble(3, dto.getLength());
			statement.setString(4, dto.getConstructedBy());
			statement.setString(5, dto.getConstructedDate());
			statement.setString(6, dto.getCountry());
			statement.setString(7, dto.getArea());

			boolean update = statement.execute();

			System.out.println("update" + update);
			if (!update)
				System.out.println(statement.getUpdateCount());
		} finally {
			conn.close();
			System.out.println("connection closed");

		}

	}

	@Override
	public void save(List<TallestBuildingDTO> dto) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO  tallest_building VALUES (?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, dto1.getId());
			statement.setString(2, dto1.getName());
			statement.setDouble(3, dto1.getLength());
			statement.setString(4, dto1.getConstructedBy());
			statement.setString(5, dto1.getConstructedDate());
			statement.setString(6, dto1.getCountry());
			statement.setString(7, dto1.getArea());
			statement.execute();

		} finally {
			conn.close();
		}

	}

	@Override
	public void updateLengthByName(String name, double length) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection = null;
		try {
			System.out.println("inside update");
			connection = DriverManager.getConnection(url, user, password);
			String sql = "update  tallest_building  set B_LENGTH =?  where  B_NAME=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, length);
			statement.setString(2, name);
			statement.execute();
			System.out.println("update suceesfully");

		} finally {
			connection.close();
			System.out.println("connection closed");

		}
	}

	@Override
	public TallestBuildingDTO fetchByName(String name) throws SQLException {

		String sql = "select * from tallest_building where B_NAME=?";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setString(1, name);
			boolean execute = stat.execute();
			if (execute) {
				ResultSet set = stat.getResultSet();
				set.next();
				int id = set.getInt(1);
				String name1 = set.getString(2);
				double length = set.getDouble(3);
				String consby = set.getNString(4);
				String consdate = set.getNString(5);
				String country = set.getString(6);
				String	area=set.getString(7);
				TallestBuildingDTO dto = new TallestBuildingDTO();
				dto.setId(id);
				dto.setName(name1);
				dto.setLength(length);
				dto.setConstructedBy(consby);
				dto.setConstructedDate(consdate);
				dto.setCountry(country);
				dto.setArea(area);
				System.out.println(dto);

			}

		}
		return null;

	}

	@Override
	public List<TallestBuildingDTO> fetchTopFive() throws SQLException {
		String sql = "select * from tallest_building where B_ID<3";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stat = conn.prepareStatement(sql)) {
			boolean execute = stat.execute();
			ResultSet set = stat.getResultSet();
			while (set.next()) {
				int id = set.getInt("B_ID");
				String name = set.getString("B_NAME");
				double length = set.getDouble("B_LENGTH");
				String constructedby = set.getString("B_CONSTRU_BY");
				String constructeddate = set.getString("B_CONST_DATE");
				String coutry = set.getString("B_COUNTRY");
				String area=set.getString("B_AREA");
				TallestBuildingDTO dto = new TallestBuildingDTO(id, name, length, constructedby, constructeddate,
						coutry,area);

				System.out.println(dto);
			}
		}
		return null;
	}

	@Override
	public List<TallestBuildingDTO> fetchByGreaterLength(Double length) throws SQLException {
		String sql = "select * from tallest_building where B_LENGTH>?";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setDouble(1, length);
			boolean execute = stat.execute();
			if (execute) {
				ResultSet set = stat.getResultSet();
				set.next(); 
					int id = set.getInt(1);
					String name = set.getString(2);
					double length1 = set.getDouble(3);
					String consby = set.getNString(4);
					String consdate = set.getNString(5);
					String country = set.getString(6);
					String area=set.getString(7);
					

					TallestBuildingDTO dto = new TallestBuildingDTO();
					dto.setId(id);
					dto.setName(name);
					dto.setLength(length1);
					dto.setConstructedBy(consby);
					dto.setConstructedDate(consdate);
					dto.setCountry(country);
					dto.setArea(area);
					System.out.println(dto);
				}

		}

		return null;
	}

	@Override
	public List<TallestBuildingDTO> fetchByMaxTopFiveLength(double length) throws SQLException {
		String sql = "select * from tallest_building where B_LENGTH>?";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stat = conn.prepareStatement(sql)) {
			stat.setDouble(1, length);
			boolean execute = stat.execute();
			if (execute) {
				ResultSet set = stat.getResultSet();
				set.next();
				int id = set.getInt(1);
				String name = set.getString(2);
				double length1 = set.getDouble(3);
				String consby = set.getNString(4);
				String consdate = set.getNString(5);
				String country = set.getString(6);
				String area=set.getString(7);

				TallestBuildingDTO dto = new TallestBuildingDTO();
				dto.setId(id);
				dto.setName(name);
				dto.setLength(length1);
				dto.setConstructedBy(consby);
				dto.setConstructedDate(consdate);
				dto.setCountry(country);
				dto.setArea(area);
				System.out.println(dto);

			}

		}
		return null;
	}

}// end
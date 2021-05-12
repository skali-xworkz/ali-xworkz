package com.xworkz.xworkzapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.xworkzapp.DTO.MatrimonyDTO;
import com.xworkz.xworkzapp.DTO.MatrimonyDTO.Gender;
import com.xworkz.xworkzapp.*;

//stored procedure ==crud or DB

public class MatrimonyDAOImpl implements MatrimonyDAO {

	public MatrimonyDAOImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(MatrimonyDTO dto) throws SQLException {
		// TODO Auto-generated method stub

		System.out.println("invoked save" + dto);
		// Class.forName(DBConstants.DRIVER);
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);
			// Statement stmt=conn.createStatement();
			String sql = "INSERT INTO matrimony values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, dto.getMid());
			preparedStatement.setString(2, dto.getRegisterName());
			preparedStatement.setString(3, dto.getGender().toString());
			preparedStatement.setString(4, dto.getLookingFor());
			preparedStatement.setString(5, dto.getQualification());
			preparedStatement.setString(6, dto.getHabits());

			// true=resultSet ==select
			// false == Update Statement
			boolean update = preparedStatement.execute();

			System.out.println("update" + update);
			if (!update)
				System.out.println(preparedStatement.getUpdateCount());

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}

	}

	@Override
	public MatrimonyDTO fetchByRegisterName(String name) throws SQLException {
		// TODO Auto-generated method stub

		// don't touch this code(fetchByRegisterName) just doing my own experiment.
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select * from matrimony where M_REG_NAME=?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("result set found,can get reference of RS " + resultSet);
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				int id = rs.getInt(1);
				String registerName = rs.getString(2);
				//System.out.println(registerName);
				String gender = rs.getString(3);
				//System.out.println(gender);
				String lookingFor = rs.getString(4);
				//System.out.println(lookingFor);
				String qualification = rs.getString(5);
				//System.out.println(qualification);

				String habits = rs.getString(6);
				//System.out.println(habits);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setMid(id);
				dto.setRegisterName(registerName);
				dto.setLookingFor(lookingFor);
				dto.setQualification(qualification);
				dto.setHabits(habits);

				// converting string to enum,jdbc will not return enum
				if (gender.equals("M"))
					dto.setGender(Gender.M);
				if (gender.equals("F"))
					dto.setGender(Gender.F);
				if (gender.equals("O"))
					dto.setGender(Gender.O);

				System.out.println(dto);
				return dto;

			} else {
				System.out.println("result set not found, provide valid INPUT");
			}

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}
		return null;

	}

	@Override
	public MatrimonyDTO fetchById(int id) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select * from matrimony where M_ID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("___Matrimony_Details__FETCH_By_Id__");
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				int idd = rs.getInt(1);
				System.out.println(idd);
				String registerName = rs.getString(2);
				String gender = rs.getString(3);
				String lookingFor = rs.getString(4);
				String qualification = rs.getString(5);
				String habits = rs.getString(6);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setMid(idd);
				dto.setRegisterName(registerName);
				dto.setLookingFor(lookingFor);
				dto.setQualification(qualification);
				dto.setHabits(habits);

				// converting string to enum,jdbc will not return enum
				if (gender.equals("M"))
					dto.setGender(Gender.M);
				if (gender.equals("F"))
					dto.setGender(Gender.F);
				if (gender.equals("O"))
					dto.setGender(Gender.O);

				System.out.println(dto);
				return dto;
			}
		} finally {
			conn.close();
			System.out.println("connection closed");

		}
		return null;
	}

	@Override
	public void updateHabitsByRegname(String habit, String regName) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);
			System.out.println("___Matrimony_Details__update_Habits__By_Regname__");
			String sql = "update matrimony set M_HABITS=? where M_REG_NAME=?;";
			;
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, habit);
			preparedStatement.setString(2, regName);
			boolean resultSet = preparedStatement.execute();
			System.out.println("updated succesfully...check in sql workbech");

		} finally {
			conn.close();
			System.out.println("connection closed");

		}
	}

	@Override
	public MatrimonyDTO fetchByRegNameAndQualification(String regNamee, String qualif) throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select ?,? from matrimony;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, regNamee);
			preparedStatement.setString(2, qualif);
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("___Matrimony_Details__FETCH_By_RegName___And__Qualification");
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				String registerName = rs.getString(1);
				System.out.println(registerName);
				String qualification = rs.getString(2);
				System.out.println(qualification);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setRegisterName(registerName);
				dto.setQualification(qualification);
				return dto;

			}

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}
		return null;
	}

	@Override
	public MatrimonyDTO fetchByIDAndGender(int id, Gender genderr) throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select ?,? from matrimony;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, genderr.toString());
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("___Matrimony_Details__FETCH_By_ID__And__Gender");
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				int idd = rs.getInt(1);
				String gender = rs.getString(2);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setMid(idd);

				// converting string to enum,jdbc will not return enum
				if (gender.equals("M"))
					dto.setGender(Gender.M);
				if (gender.equals("F"))
					dto.setGender(Gender.F);
				if (gender.equals("O"))
					dto.setGender(Gender.O);
				System.out.println(dto.getMid() + "\t" + dto.getGender());
				return dto;

			}

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}
		return null;
	}

	@Override
	public void deleteByRegNameAndGendeAndqualification(Gender genderr, String reg, String qua) throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "delete  from matrimony where M_REG_NAME=? and M_GENDER=? and M_QUALIFICATION=?;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, reg);
			preparedStatement.setString(2, genderr.toString());
			preparedStatement.setString(3, qua);
			boolean resultSet = preparedStatement.execute();
			System.out.println("deleted succesully..check in sql workbench");

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}
	}

	@Override
	public int getTotalrows() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);
			// Statement stmt=conn.createStatement();
			String sql = "SELECT count(M_ID) FROM matrimony;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("___Matrimony_NO_OF_ROWS_Details__");
				ResultSet rs = preparedStatement.getResultSet();
				rs.next();
				int totalRows = rs.getInt(1);
				System.out.println(totalRows);
			} else {
				System.out.println("ROWS__Not found...");
			}

			}
		 finally {
			conn.close();
			System.out.println("connection closed");
		}
		return 0;
	}

	@Override
	public MatrimonyDTO fetchByGenderAndRegName(String regName, Gender genderr) throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select ?,? from matrimony;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, regName);
			preparedStatement.setString(2, genderr.toString());
			boolean resultSet = preparedStatement.execute();
			if (resultSet) {
				System.out.println("___Matrimony_Details__FETCH_By_Gender__RegName");
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				String registerName = rs.getString(1);
				String gender = rs.getString(2);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setRegisterName(registerName);

				// converting string to enum,jdbc will not return enum
				if (gender.equals("M"))
					dto.setGender(Gender.M);
				if (gender.equals("F"))
					dto.setGender(Gender.F);
				if (gender.equals("O"))
					dto.setGender(Gender.O);

				System.out.println(dto.getGender() + "\t" + dto.getRegisterName());
				return dto;

			}

		}

		finally {
			conn.close();
			System.out.println("connection closed");
		}
		return null;
	}

	@Override
	public void updateQualificationByRegNameAndDeleteById(String qua, String regName, int deleteId)
			throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);
			System.out.println("___Matrimony_Details__update_Qualification__By_Regname__");
			String sqlUpdate = "update matrimony set M_QUALIFICATION=? where M_REG_NAME=?;";
			PreparedStatement preparedStatement = conn.prepareStatement(sqlUpdate);
			preparedStatement.setString(1, qua);
			preparedStatement.setString(2, regName);
			boolean resultSet = preparedStatement.execute();
			System.out.println("updated succesfully...check in sql workbech");

			System.out.println("************************************");
			String sqlDelete = "delete  from matrimony where M_ID=?;";
			PreparedStatement preparedStatement1 = conn.prepareStatement(sqlDelete);
			preparedStatement1.setInt(1, deleteId);
			boolean resultSett = preparedStatement1.execute();
			System.out.println("deleted succesully..check in sql workbench");

		} finally {
			conn.close();
			System.out.println("connection closed");

		}

	}

	@Override
	public MatrimonyDTO fetchByIdAndUpdateQualificationByRegName(int idd, String quaa, String regNamee)
			throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBConstants.URL, DBConstants.PASSWORD, DBConstants.USERNAME);

			String sql = "select * from matrimony where M_ID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, idd);
			boolean resultSet = preparedStatement.execute();

			System.out.println("___Matrimony_Details__update_Qualification__By_Regname__");
			String sqlUpdatee = "update matrimony set M_QUALIFICATION=? where M_REG_NAME=?;";
			PreparedStatement preparedStatement1 = conn.prepareStatement(sqlUpdatee);
			preparedStatement1.setString(1, quaa);
			preparedStatement1.setString(2, regNamee);
			boolean resultSett = preparedStatement1.execute();
			System.out.println("updated succesfully...check in sql workbech");

			if (resultSet) {
				System.out.println("___Matrimony_Details__FETCH_By_Id__");
				ResultSet rs = preparedStatement.getResultSet();

				rs.next();
				int id = rs.getInt(1);
				System.out.println(id);
				String registerName = rs.getString(2);
				String gender = rs.getString(3);
				String lookingFor = rs.getString(4);
				String qualification = rs.getString(5);
				String habits = rs.getString(6);

				MatrimonyDTO dto = new MatrimonyDTO();
				dto.setMid(id);
				dto.setRegisterName(registerName);
				dto.setLookingFor(lookingFor);
				dto.setQualification(qualification);
				dto.setHabits(habits);

				// converting string to enum,jdbc will not return enum
				if (gender.equals("M"))
					dto.setGender(Gender.M);
				if (gender.equals("F"))
					dto.setGender(Gender.F);
				if (gender.equals("O"))
					dto.setGender(Gender.O);

				System.out.println(dto);
				return dto;

			}
		} finally {
			conn.close();
			System.out.println("connection closed");

		}
		return null;

	}

}
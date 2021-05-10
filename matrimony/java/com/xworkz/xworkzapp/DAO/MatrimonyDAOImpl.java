package com.xworkz.xworkzapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.xworkzapp.DTO.MatrimonyDTO;

import com.xworkz.xworkzapp.*;

//stored procedure ==crud or DB

public class MatrimonyDAOImpl implements MatrimonyDAO {

	public MatrimonyDAOImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(MatrimonyDTO dto) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("invoked save" + dto);
		Class.forName(DBConstants.DRIVER); 
		Connection conn=null;
		try {
				conn=DriverManager.getConnection(DBConstants.URL,DBConstants.PASSWORD,DBConstants.USERNAME);
			Statement stmt=conn.createStatement();
	String sql="INSERT INTO matrimony values(?,?,?,?,?,?)";
PreparedStatement preparedStatement=conn.prepareStatement(sql);
	preparedStatement.setInt(1, dto.getMid());
	preparedStatement.setString(2, dto.getRegisterName());
	preparedStatement.setString(3, dto.getGender().toString());
	preparedStatement.setString(4, dto.getLookingFor());
	preparedStatement.setString(5, dto.getQualification());
	preparedStatement.setString(6, dto.getHabits());
	
	//true=resultSet ==select
	//false == Update Statement
	boolean update=preparedStatement.execute();

	System.out.println("update"+update);
	if(!update)
		System.out.println(preparedStatement.getUpdateCount());
		
	
		}
	
		finally {
			conn.close();
			System.out.println("connection closed");
	}
		
		}

}

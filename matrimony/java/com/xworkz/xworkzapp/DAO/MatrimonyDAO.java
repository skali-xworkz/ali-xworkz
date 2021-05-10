package com.xworkz.xworkzapp.DAO;

import java.sql.SQLException;

import com.xworkz.xworkzapp.DTO.MatrimonyDTO;


public interface MatrimonyDAO {
	public void save(MatrimonyDTO dto) throws ClassNotFoundException, SQLException;
}

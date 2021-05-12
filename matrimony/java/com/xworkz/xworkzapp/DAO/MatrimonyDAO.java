package com.xworkz.xworkzapp.DAO;

import java.sql.SQLException;

import com.xworkz.xworkzapp.DTO.MatrimonyDTO;
import com.xworkz.xworkzapp.DTO.MatrimonyDTO.Gender;


public interface MatrimonyDAO {
	public void save(MatrimonyDTO dto) throws  SQLException;

	public MatrimonyDTO fetchByRegisterName(String name)throws  SQLException;

	public MatrimonyDTO fetchById(int id)throws SQLException;

	public void updateHabitsByRegname(String habit,String regName)throws SQLException;
	
	
	public MatrimonyDTO fetchByRegNameAndQualification(String regNamee,String qualif)throws SQLException;

	public MatrimonyDTO  fetchByIDAndGender(int id,Gender gender)throws SQLException;

	public void deleteByRegNameAndGendeAndqualification(Gender gender,String  reg, String qua)throws SQLException;

	public int getTotalrows()throws SQLException;
	
	
	public  MatrimonyDTO fetchByGenderAndRegName(String regName,Gender gender)throws  SQLException;

	public void updateQualificationByRegNameAndDeleteById(String qua,String regName,int deleteId)throws SQLException;
	
	
	public MatrimonyDTO  fetchByIdAndUpdateQualificationByRegName(int idd,String quaa,String RegNamee)throws SQLException;
}

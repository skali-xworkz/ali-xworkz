package com.xworkz.xworkzapp;

import java.sql.SQLException;

import com.xworkz.xworkzapp.DAO.MatrimonyDAO;
import com.xworkz.xworkzapp.DAO.MatrimonyDAOImpl;
import com.xworkz.xworkzapp.DTO.MatrimonyDTO;
import com.xworkz.xworkzapp.DTO.MatrimonyDTO.Gender;

public class MatrimonyTester {
	public static void main(String[] args)throws ClassNotFoundException, SQLException  {
		MatrimonyDTO mdt=new MatrimonyDTO();
		mdt.setMid(1);
		mdt.setRegisterName("ALI");
		mdt.setGender(Gender.F);
		mdt.setLookingFor("Good Looking");
		mdt.setQualification("Degree");
		mdt.setHabits("Reading Books");
		
		MatrimonyDAO mda=new MatrimonyDAOImpl();
		mda.save(mdt);
	}
	
}

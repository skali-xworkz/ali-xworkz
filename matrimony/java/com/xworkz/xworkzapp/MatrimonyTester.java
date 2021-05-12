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
		
		MatrimonyDTO mdt1=new MatrimonyDTO();
		mdt1.setMid(2);
		mdt1.setRegisterName("Rehaman");
		mdt1.setGender(Gender.F);
		mdt1.setLookingFor("Execellent");
		mdt1.setQualification("PH.D");
		mdt1.setHabits("watching T.V serials");
		
		MatrimonyDTO mdt2=new MatrimonyDTO();
		mdt2.setMid(3);
		mdt2.setRegisterName("Appu");
		mdt2.setGender(Gender.F);
		mdt2.setLookingFor("Very Good");
		mdt2.setQualification("Any degree");
		mdt2.setHabits("Dancing & singing");
		
		
		
		MatrimonyDAO mda=new MatrimonyDAOImpl();
		mda.save(mdt);
		mda.save(mdt1);
		mda.save(mdt2);
		
		mda.fetchByRegisterName("ALI");
		mda.fetchById(3);
		
		mda.updateHabitsByRegname("Playing video Games", "Rehaman");
		
		mda.fetchByRegNameAndQualification("appu","Any degree");
		
		
		mda.fetchByIDAndGender(1, Gender.F);
		
		mda.deleteByRegNameAndGendeAndqualification(Gender.F, "Appu", "Any degree");
		
		mda.getTotalrows();
		
		mda.fetchByGenderAndRegName("Appu", Gender.F);
		
		
		mda.updateQualificationByRegNameAndDeleteById("professor", "Rehaman", 1);
		
		mda.fetchByIdAndUpdateQualificationByRegName(2, "CEO", "Appu");
	
	
	
	}
	
}

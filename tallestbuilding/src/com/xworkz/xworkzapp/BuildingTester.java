package com.xworkz.xworkzapp;

import java.sql.SQLException;

import com.xworkz.xworkzapp.DAO.TallestBuildingDAO;
import com.xworkz.xworkzapp.DAO.TallestBuildingDAOImpl;
import com.xworkz.xworkzapp.DTO.TallestBuildingDTO;

public class BuildingTester {
	public static void main(String[] args) throws SQLException {
		TallestBuildingDTO dto = new TallestBuildingDTO(1,"Presidential Tower",700,"Golden_Gate_Properties_Ltd","16/mar/2004","INDIA","yeshwantapur");
		
		TallestBuildingDTO dto1 = new TallestBuildingDTO(2,"Buraja_khalifa",500,"dubai","16/jan/2002","Rehaman","armani_residence");

		
		TallestBuildingDAO tbd = new TallestBuildingDAOImpl();
		tbd.save(dto);
		tbd.updateLengthByName("Presidential Tower", 950);
		tbd.save(dto1);
		
		tbd.fetchByName("Presidential Tower");
		
		tbd.fetchTopFive();
		
		tbd.fetchByGreaterLength(600.0);
		
		tbd.fetchByMaxTopFiveLength(700.0);
}
}
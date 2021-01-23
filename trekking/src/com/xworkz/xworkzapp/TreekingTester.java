package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.TrekkingDTO;

public class TreekingTester {
	public static void main(String[] args) {
		
		TrekkingDTO dto=new TrekkingDTO("kedarnath",34,500.00f);
		/*dto.setCost(500.00f);
		dto.setMembers(34);
		dto.setPlaces("kedarnath");*/
		System.out.println(dto.getPlaces()+"\t"+dto.getMembers()+"\t"+dto.getCost());
		
	}
	
}

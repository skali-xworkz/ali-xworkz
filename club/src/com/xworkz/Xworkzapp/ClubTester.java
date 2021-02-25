package com.xworkz.Xworkzapp;

import com.xworkz.Xworkzapp.dto.ClubDTO;

public class ClubTester {
	public static void main(String[] args) {
		ClubDTO cd=new ClubDTO("SKYYE Lounge","Bangalore",2500);
		System.out.println(cd.getName()+"\t"+cd.getPlace()+"\t"+cd.getPrice());
	}

}

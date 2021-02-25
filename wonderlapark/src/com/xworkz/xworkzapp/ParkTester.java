package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.ParkDTO;

public class ParkTester {
	public static void main(String[] args) {
	ParkDTO pd=new ParkDTO("Wonderla_Park","Bangalore",1500);
		/*TODO Auto-generated constructor stub*/
	System.out.println(pd.getName()+"\t"+pd.getPlace()+"\t"+pd.getPrice());
	}
}
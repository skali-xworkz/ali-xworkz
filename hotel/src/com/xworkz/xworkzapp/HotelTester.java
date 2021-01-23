package com.xworkz.xworkzapp;
//FQCL-fully qualified class name
import com.xworkz.xworkzapp.dto.HotelDTO;

public class HotelTester {
	public static void main(String a[])
	{
		HotelDTO hd=new HotelDTO("KAMATH \t","WhiteField");
		System.out.println(hd.getName()+""+hd.getAddress());
	

	}
}
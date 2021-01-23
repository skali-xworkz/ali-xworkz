package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.CafeDTO;

public class CafeTester {
	public static void main(String a[])
	{
		CafeDTO cd=new CafeDTO("Marzipan cafe & Bakery\t","ulsoor RD");
		System.out.println(cd.getName()+""+cd.getAddress());
	}
}

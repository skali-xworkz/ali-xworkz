package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.AmazonDto;
import com.xworkz.xworkzapp.services.AmazonService;
import com.xworkz.xworkzapp.services.AmazonServiceImp;

public class AmzonTester {
public static void main(String[] args) {
	AmazonDto ad=new AmazonDto("KGF","yash","500MB","5star");
	AmazonService as=new AmazonServiceImp();
			as.checkLogin("admin@amzon.com","amzon@123");
		as.checkadd(ad);
	as.displayMovies();
		
		
}
}

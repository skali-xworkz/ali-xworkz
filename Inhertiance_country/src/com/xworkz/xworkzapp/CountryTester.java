package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.country.Country;
import com.xworkz.xworkzapp.country.India;

public class CountryTester {
	public static void main(String[] args) {
		//polymorphism
		//upcasting
		Country india=new India();
		india.development();
		//india.capital="Delhi";
		india.noOfStates=30;
		india.population=13111100882L;
		System.out.println(india.noOfStates+" "+india.population);
	}	
}

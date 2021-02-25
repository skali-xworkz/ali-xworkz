package com.xworkz.xworkzapp;

import static com.xworkz.xworkzapp.WardName.*;

import java.util.Scanner;

import com.xworkz.xworkzapp.ward.City;
import com.xworkz.xworkzapp.ward.CityWardDTO;

public class CityTester {
	//static int n;
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Scanner sc1= new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	
	City city=new City(size);
	
	
	
	for(int i=0;i<size;i++){
		System.out.println("enter the ward no");
		int wardNo=sc.nextInt();
		System.out.println("enter the ward name");
		String wardName=sc.next();
		System.out.println("enter the population");
		long poplulation=sc.nextLong();
		System.out.println("enter the coroporation name");
		String coname=sc.next();
		System.out.println("enter the area size");
		String area=sc.next();

		CityWardDTO cw=new CityWardDTO();
	
		cw.setWardNo(wardNo);
		cw.setWardName(WardName.valueOf(wardName));
		cw.setCorporationName(coname);
		cw.setPopulation(poplulation);
		cw.setArea(area);
		
		city.addCityWards(cw);
	city.getCityWardDetails();
	}
	/*System.out.println("enter the correct input 1.update 2delete");
	int n=sc.nextInt();
	switch(n){
	case 1:
		
	System.out.println("enter ward no you want to change this population");
	int wardNo=sc.nextInt();
	
	System.out.println("enter the population");
	long population=sc.nextLong();
	
	city.update(wardNo,population);
	city.getCityWardDetails();
	break;
	case 2:
		System.out.println("2.delete");
	System.out.println("you want to delete,enter the ward no");
	int wardNo1=sc.nextInt();
	city.delete(wardNo1);
	city.getCityWardDetails();
	break;
	default:
		System.out.println("provide the correct input");
		break;*/
	city.getCityWardDetails();
	String corporation=city.getcorporationName(RAJAJINAGAR);
	System.out.println(corporation);
	
}
	
}

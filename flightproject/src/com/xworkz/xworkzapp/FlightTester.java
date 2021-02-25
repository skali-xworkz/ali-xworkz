package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.flightDTo.CompanyFlightNameDTO;
import com.xworkz.xworkzapp.flightDTo.FlightBooking;

public class FlightTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		FlightBooking fb=new FlightBooking(size);
		for (int i = 0; i < size; i++) {
			System.out.println(" if yoyu want enter domestic or non-domestic");
			boolean domestic = sc.nextBoolean();
			
			System.out.println("enter the flightNumber");
			int flight = sc.nextInt();
			System.out.println("enter the companyName");
			String CompanyName = sc.next();
			System.out.println("enter the startingPoint");
			String starting = sc.next();
			System.out.println("enter the destination");
			String desti = sc.next();
			System.out.println("enter the totalSeats");
			int total = sc.nextInt();
			System.out.println("enter the businessClassPrice");
			double business = sc.nextDouble();
			System.out.println("enter the economicClassPrice");
			double economic=sc.nextDouble();
			 
			
			CompanyFlightNameDTO cfd=new CompanyFlightNameDTO();
			cfd.setDomestic(domestic);
			cfd.setFlightNumber(flight);
			cfd.setCompanyName(CompanyNames.valueOf(CompanyName));
			cfd.setStartingPoint(starting);
			cfd.setDestination(desti);
			cfd.setTotalSeats(total);
			cfd.setBusinessClassPrice(business);
			cfd.setEconomicClassPrice(economic);
			fb.addPassenger(cfd);
		}
		fb.getFlightInfo();
		System.out.println("enter the starting point");
		String starting= sc.next();
		fb.getFlightDetails(starting);

}
}
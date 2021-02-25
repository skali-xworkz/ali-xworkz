package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.BusDTO.BusBooking;
import com.xworkz.xworkzapp.BusDTO.CompanyBusNameDTO;

public class BusTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		BusBooking bb=new BusBooking(size);
		for (int i = 0; i < size; i++) {
			System.out.println(" if you want enter AC or non-AC");
			boolean busType = sc.nextBoolean();
			
			
			System.out.println("enter the BusNumber");
			int busNumber= sc.nextInt();
			System.out.println("enter the travelsName");
			String travelName = sc.next();
			System.out.println("enter the source details");
			String source = sc.next();
			System.out.println("enter the destination details");
			String destin = sc.next();
			System.out.println("enter the totalSeats");
			int total = sc.nextInt();
			System.out.println("enter the Bus ticket price");
			int busTicket = sc.nextInt();
			
			
			CompanyBusNameDTO cb=new CompanyBusNameDTO();
			cb.setBusType(busType);
			cb.setBusNumber(busNumber);
			cb.setBusCompanyName(BusCompanyNames.valueOf(travelName));
			cb.setSource(source);
			cb.setDestination(destin);
			cb.setTotalSeats(total);
			cb.setBusTicket(busTicket);
			bb.addCustomer(cb);			
		}
		bb.getBusInformation();
	}
}

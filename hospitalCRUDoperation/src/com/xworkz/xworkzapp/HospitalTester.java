package com.xworkz.xworkzapp;

import java.util.Scanner;

import hospitalCRUDoperation.hospital.Hospital;
import hospitalCRUDoperation.hospital.PatientsDTO;

public class HospitalTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Hospital hs = new Hospital();
		for (int i = 0; i < size; i++) {
			System.out.println("enter the patientID");
			int patientId = sc.nextInt();
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the address");
			String address = sc.next();

		PatientsDTO pd = new PatientsDTO();
		pd.setPatientID(patientId);
		pd.setName(name);
		pd.setAddress(address);

		hs.addPatients(pd);
		//hs.addPatients(pd1);
		}
		//hs.getPatientDetails();
		System.out.println("enter the patient name");
		String name1 = sc.next();
		hs.getPatientsByName(name1);
		System.out.println("enter the new patient address");
		String address = sc.next();
		hs.getPatientsByName(address);
		boolean check=hs.updatepatientAddressByPatientName(name1, address);
		System.out.println(check);
		hs.getPatientDetails();
	}
}
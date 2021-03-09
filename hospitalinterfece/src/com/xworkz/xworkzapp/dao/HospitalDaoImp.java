package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDto;

public class HospitalDaoImp implements HospitalDao {
	HospitalDto hospitaldetails[]=new HospitalDto[2];
	int index=0;
	public HospitalDaoImp(){
		System.out.println("inside hospitalDAO Implementaion");
	}
	@Override
	public void hospitalAddDto(HospitalDto dto) {
		// TODO Auto-generated method stub
		hospitaldetails[index]=dto;
		index++;
		System.out.println("hospital added succesfully");
	}
	@Override
	public void displayHospitalDetails() {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < index; i++) {
			if(hospitaldetails[i]!=null){
	System.out.println("Hospital name:"+hospitaldetails[i].getName());
	System.out.println("Hospital license no:"+hospitaldetails[i].getLicenseNumber());
	System.out.println("Hospital location :"+hospitaldetails[i].getLocation());
	System.out.println("Hospital founder:"+hospitaldetails[i].getFounder());
	System.out.println("Hospital specialization:"+hospitaldetails[i].getSpecialization());
	System.out.println("Hospital contact number:"+hospitaldetails[i].getPhoneNo());
		}
		}
	}
	@Override
	public void updateDisplayLicense(String licenseNumber, String phoneNo) {
		// TODO Auto-generated method stub
		System.out.println("inside update method");
		for (int i = 0; i < hospitaldetails.length; i++) {
			if(hospitaldetails[i].getLicenseNumber().equals(licenseNumber)){
				System.out.println("license number found & updating");
				hospitaldetails[i].setPhoneNo(phoneNo);
			}else
				System.out.println("invalid license number");
			}
		}
	@Override
	public void delete(String licenseNumber) {
		// TODO Auto-generated method stub
		for (int i = 0; i < hospitaldetails.length; i++) {
			if(hospitaldetails[i].getLicenseNumber()==licenseNumber){
				System.out.println("deleted suceesfully");
				hospitaldetails[i]=null;
			}else
				System.out.println("invalid license number");
		}
	}
	@Override
	public void passParticularData(String licenseNumber, String founder) {
		// TODO Auto-generated method stub
		System.out.println("passParticularData updating once again");
		for (int i = 0; i < hospitaldetails.length; i++) {
		if(hospitaldetails[i].getLicenseNumber().equals(licenseNumber) && hospitaldetails[i].getFounder().equals(founder)){
			System.out.println("Hospital name:"+hospitaldetails[i].getName());
			System.out.println("Hospital license no:"+hospitaldetails[i].getLicenseNumber());
			System.out.println("Hospital location :"+hospitaldetails[i].getLocation());
			System.out.println("Hospital founder:"+hospitaldetails[i].getFounder());
			System.out.println("Hospital specialization:"+hospitaldetails[i].getSpecialization());
			System.out.println("Hospital contact number:"+hospitaldetails[i].getPhoneNo());
					
		}
		}
	}
		
	}
	
	
	

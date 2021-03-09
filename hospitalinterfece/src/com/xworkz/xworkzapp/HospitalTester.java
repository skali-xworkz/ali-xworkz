package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HospitalDto;
import com.xworkz.xworkzapp.service.HospitalService;
import com.xworkz.xworkzapp.service.HospitalServiceImp;

public class HospitalTester {
public static void main(String[] args) {
	HospitalDto hd=new HospitalDto("hos123ax","apolla","vijaynagar","rahul","eyespecialise","8488592492");
	HospitalDto hd1=new HospitalDto("app123qw","ESIhospital","Rajajinagar","ravirav","earspecialise","7774433221");
	HospitalService hs=new HospitalServiceImp();
	hs.checkingValidLicenseNumber(hd);
	hs.checkingValidLicenseNumber(hd1);
	hs.displayall();
	hs.checkUpadateDetails("hos123ax", "8123456789");
	hs.displayall();
	hs.checkdelete("app123qw");
	hs.displayall();
	hs.twiceCheckingData("hos123ax","rahul");
	
}
}

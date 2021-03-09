package com.xworkz.xworkzapp.dto;

public class HospitalDto {
private String licenseNumber;
private String  name;
private String location;
private String founder;
private String specialization;
private String phoneNo;
public HospitalDto(String licenseNumber, String name, String location, String founder, String specialization,
		String phoneNo) {
	super();
	this.licenseNumber = licenseNumber;
	this.name = name;
	this.location = location;
	this.founder = founder;
	this.specialization = specialization;
	this.phoneNo = phoneNo;
}
public String getLicenseNumber() {
	return licenseNumber;
}
public void setLicenseNumber(String licenseNumber) {
	this.licenseNumber = licenseNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getFounder() {
	return founder;
}
public void setFounder(String founder) {
	this.founder = founder;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
}

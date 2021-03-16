package com.xworkz.xworkzapp.dto;

public class UserDTO {
private String name;
private String email;
private long phoneNo;
private int adharId;

public UserDTO(String name, String email, long phoneNo, int adharId) {
	super();
	this.name = name;
	this.email = email;
	this.phoneNo = phoneNo;
	this.adharId = adharId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public int getAdharId() {
	return adharId;
}
public void setAdharId(int adharId) {
	this.adharId = adharId;
}

}

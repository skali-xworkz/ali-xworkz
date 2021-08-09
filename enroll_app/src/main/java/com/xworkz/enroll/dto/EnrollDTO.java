package com.xworkz.enroll.dto;

public class EnrollDTO {
	private String enrollName;
	private String email;
	
	public EnrollDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("EnrollDTO object is  created");
	}
	public String getEnrollName() {
		return enrollName;
	}
	public void setEnrollName(String enrollName) {
		this.enrollName = enrollName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

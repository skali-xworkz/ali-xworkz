package com.xworkz.enroll.dto;

public class EnrollDTO {
	private String enrollName;
	private String email;
	
	public EnrollDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("EnrollDTO object is  created");
	}
	
	public EnrollDTO(String enrollName, String email) {
		super();
		this.enrollName = enrollName;
		this.email = email;
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
	@Override
	public String toString() {
		return "EnrollDTO [enrollName=" + enrollName + ", email=" + email + "]";
	}
	
	
}

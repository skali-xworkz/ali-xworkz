package com.xworkz.amazon.dto;

public class AmazonDTO {
	private String name;
	private String password;
	
	public AmazonDTO() {
		System.out.println(getClass().getSimpleName() + "Object Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AmazonDTO [name=" + name + ", password=" + password + "]";
	}
	
	
}

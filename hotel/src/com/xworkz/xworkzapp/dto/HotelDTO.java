package com.xworkz.xworkzapp.dto;

public class HotelDTO {
	private String name;
	private String address;
	
	public HotelDTO(String nm , String ad1){
		System.out.println("object of hotel DTO created");
		name=nm;
		address=ad1;
	}
	public void setName(String n1)
	{
		name=n1;
		
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String a1)
	{
		address=a1;
	}
	public String getAddress()
	{
		return address;
	}
}
package com.xworkz.Xworkzapp.dto;

public class ClubDTO {
	private String name;
	private String place;
	private int price;
	public ClubDTO(String name,String place,int price) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.place=place;
	this.price=price;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public int getPrice() {
		return price;
	}
}

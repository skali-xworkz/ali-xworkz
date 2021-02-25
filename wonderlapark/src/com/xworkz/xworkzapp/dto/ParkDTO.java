package com.xworkz.xworkzapp.dto;

public class ParkDTO {
	private String name;
	private String place;
	private int price;
	public ParkDTO(String name,String place,int price) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.place=place;
	this.price=price;
	}
	/*public void setName(String name) {
		this.name = name;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setPrice(int price) {
		this.price = price;
	}*/
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

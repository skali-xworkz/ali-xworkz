package com.xworkz.xworkzapp.dto;

public class PlaceDTO {
	private String name;
	private String location;
	private long pincode;
	private boolean goodplace;
	public PlaceDTO(String name, String location, long pincode, boolean goodplace) {
		super();
		this.name = name;
		this.location = location;
		this.pincode = pincode;
		this.goodplace = goodplace;
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
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public boolean isGoodplace() {
		return goodplace;
	}
	public void setGoodplace(boolean goodplace) {
		this.goodplace = goodplace;
	}
}

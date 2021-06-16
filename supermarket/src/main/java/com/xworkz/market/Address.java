package com.xworkz.market;

public class Address {

	private String street;
	private int buildingNo;
	private int doorNo;
	private int pincode;
	private String area;
	public Address(String street, int buildingNo, int doorNo, int pincode, String area) {
		super();
		this.street = street;
		this.buildingNo = buildingNo;
		this.doorNo = doorNo;
		this.pincode = pincode;
		this.area = area;
		System.out.println(this.getClass().getSimpleName()+"object created");
	}
	@Override
	public String toString() {
		return "Address [" + (street != null ? "street=" + street + ", " : "") + "buildingNo=" + buildingNo
				+ ", doorNo=" + doorNo + ", pincode=" + pincode + ", " + (area != null ? "area=" + area : "") + "]";
	}
	
	
}

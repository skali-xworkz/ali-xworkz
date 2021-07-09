package com.xworkz.mobile.dto;

public class MobileDTO {

	private String name;
	private String brand;
	private String ram;
	private String price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public MobileDTO() {
		System.out.println("MobileDTO object is created");
	}
	@Override
	public String toString() {
		return "MobileDTO [name=" + name + ", brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

}

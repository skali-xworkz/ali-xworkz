package com.xworkz.chocolate;

public class chocolate {
	private String name;
	private String size;
	private double price;
	private String brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	public void taste() {
		System.out.println("invoked taste");
		System.out.println("choclate has taste");
	}

	public void stressReliver() {
		System.out.println("invoked stressReliver");
		System.out.println("eat choclate to reduce Stress");
	}
}

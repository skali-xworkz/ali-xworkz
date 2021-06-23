package com.xworkz.sanitizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sanitizer {

	@Value("Dalmia Sanjeevani")
	private String name;
	@Value("250")
	private float price;
	@Value("Dalmia")
	private String brand;
	@Value("1")
	private int quantity;
	@Autowired
	private Alchohol alchohol;

	public Sanitizer(String name, float price, String brand, int quantity, Alchohol alchohol) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.alchohol = alchohol;
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public Sanitizer() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setAlchohol(Alchohol alchohol) {
		this.alchohol = alchohol;
	}

	@Override
	public String toString() {
		return "Sanitizer [name=" + name + ", price=" + price + ", brand=" + brand + ", quantity=" + quantity
				+ ", alchohol=" + alchohol + "]";
	}

}

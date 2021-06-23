package com.xworkz.sanitizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alchohol {

	@Value("Chemtex Alstacol")
	private String name;
	@Value("500ml")
	private String size;
	@Value("Pack of 2,Pack of 6")
	private String packSize;

	public Alchohol(String name, String size, String packSize) {
		super();
		this.name = name;
		this.size = size;
		this.packSize = packSize;

		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public Alchohol() {

		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBp(String size) {
		this.size = size;
	}

	public void setDestiny(String packSize) {
		this.packSize = packSize;
	}

	@Override
	public String toString() {
		return "Alchohol [name=" + name + ", Size=" + size + ", packSize=" + packSize + "]";
	}

}

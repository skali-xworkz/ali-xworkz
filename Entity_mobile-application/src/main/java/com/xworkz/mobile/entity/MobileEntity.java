package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "mobile")
public class MobileEntity implements java.io.Serializable {

	@Column(name = "M_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileId;
	@Column(name = "M_NAME")

	private String name;
	@Column(name = "M_BRAND")

	private String brand;
	@Column(name = "M_RAM")

	private String ram;
	@Column(name = "M_PRICE")
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
	@Override
	public String toString() {
		return "MobileEntity [mobileId=" + mobileId + ", name=" + name + ", brand=" + brand + ", ram=" + ram
				+ ", price=" + price + "]";
	}

}

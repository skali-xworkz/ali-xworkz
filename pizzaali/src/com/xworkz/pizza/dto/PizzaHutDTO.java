package com.xworkz.pizza.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pizza_table")
@NamedQueries({ @NamedQuery(name = "getAllRecords", query = "from PizzaHutDTO")})
public class PizzaHutDTO implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PIZZA_ID")
	private int pizzaID;
//	@NonNull
	@Column(name = "NAME")
	private String name;
//	@NonNull
	@Column(name = "LOCATION")
	private String location;
	//@NonNull
	@Column(name = "PRIZE")
	private String price;
//	@NonNull
	@Column(name = "IS_AVAILABLE")
	private String isAvailable;
//	@NonNull
	@Column(name = "SIZE")
	private String size;
	//@NonNull
	@Column(name = "TYPE")
	private String type;

	public PizzaHutDTO() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public int getPizzaID() {
		return pizzaID;
	}

	public void setPizzaID(int pizzaID) {
		this.pizzaID = pizzaID;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PizzaHutDTO(int pizzaID, String name, String location, String price, String isAvailable, String size,
			String type) {
		super();
		this.pizzaID = pizzaID;
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
		System.out.println("parameter calling");
	}

	@Override
	public String toString() {
		return "PizzaHutDTO [pizzaID=" + pizzaID + ", name=" + name + ", location=" + location + ", price=" + price
				+ ", isAvailable=" + isAvailable + ", size=" + size + ", type=" + type + "]";
	}
	

}

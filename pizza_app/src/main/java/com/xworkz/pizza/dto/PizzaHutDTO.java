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

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "pizza_table")
@NamedQueries({ @NamedQuery(name = "getAllRecords", query = "from PizzaHutDTO"),
		@NamedQuery(name = "getPriceByName", query = "select p.price from PizzaHutDTO AS p where p.name=:pizzaname"),
		@NamedQuery(name = "loadFirstResultAndMaxResult", query = "from PizzaHutDTO"),
		@NamedQuery(name = "sumOfAllPizza", query = "select sum(price) from PizzaHutDTO"),
		@NamedQuery(name = "getMaxPriceOfPizza", query = "select max(price) from PizzaHutDTO"),
		@NamedQuery(name = "getMinPriceOfPizza", query = "select min(price) from PizzaHutDTO"),
		@NamedQuery(name = "getAvgPriceOfPizza", query = "select avg(price) from PizzaHutDTO") })
public class PizzaHutDTO implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PIZZA_ID")
	private int pizzaID;
	@NonNull
	@Column(name = "NAME")
	private String name;
	@NonNull
	@Column(name = "LOCATION")
	private String location;
	@NonNull
	@Column(name = "PRIZE")
	private double price;
	@NonNull
	@Column(name = "IS_AVAILABLE")
	private boolean isAvailable;
	@NonNull
	@Column(name = "SIZE")
	private String size;
	@NonNull
	@Column(name = "TYPE")
	private String type;

	public PizzaHutDTO() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}

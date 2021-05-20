package com.xworkz.pizza.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="pizza_table")
public class PizzaHutDTO implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PIZZA_ID")
	private int pizzaID;
	@NonNull
	@Column(name="NAME")
	private String name;
	@NonNull
	@Column(name="LOCATION")
	private String location;
	@NonNull
	@Column(name="PRIZE")
	private double price;
	@NonNull
	@Column(name="IS_AVAILABLE")
	private boolean isAvailable;
	@NonNull
	@Column(name="SIZE")
	private String size;
	@NonNull
	@Column(name="TYPE")
	private String type;
	
	public PizzaHutDTO() {
		System.out.println("created " +this.getClass().getSimpleName());
	}
	
}

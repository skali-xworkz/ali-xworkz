package com.xworkz.sewingmachine.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sewingmachine")

public class SewingMachineDTO {

	@Column(name = "S_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int machineid;

	@NonNull
	@Column(name = "NAME")
	private String name;

	@NonNull
	@Column(name = "MODEL")
	private String model;

	@NonNull
	@Column(name = "PRICE")
	private double price;

	@NonNull
	@Column(name = "COLOR")
	private String color;

	@NonNull
	@Column(name = "ISWORKING")
	private boolean isWorking;

}

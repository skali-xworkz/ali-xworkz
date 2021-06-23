package com.xworkz.sonytv.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Entity
@Table(name="sony")
public class SonyTVDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="S_ID")
	private int id;
	@Column(name="S_NAME")
	@NonNull
	private String name;
	@Column(name="S_PRICE")
	@NonNull
	private double price;
	public SonyTVDTO() {
		System.out.println("SONY TV Object created"+getClass().getSimpleName());
	}

}


package com.xworkz.vacccine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "vaccine_dosage")
@NamedQueries({
	@NamedQuery(name = "GetRecordByMail", query = "select name from VaccineEntity name where name.email=:em and name.password=:e ")})
public class VaccineEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VACCINE_ID")
	private int vaccineId;

	@Column(name = "USER_NAME")
	private String name;

	@Column(name = "EMAIL_ID")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "USER_OTP")
	private int otp;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public VaccineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
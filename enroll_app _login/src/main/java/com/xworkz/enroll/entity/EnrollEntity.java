package com.xworkz.enroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enroll_table")
public class EnrollEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENROLL_ID")
	private int enrollId;

	@Column(name = "ENROLL_NAME")
	private String enrollName;

	@Column(name = "ENROLL_EMAIL")
	private String email;

	public int getEnrollId() {
		return enrollId;
	}

	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}

	public String getEnrollName() {
		return enrollName;
	}

	public void setEnrollName(String enrollName) {
		this.enrollName = enrollName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "EnrollEntity [enrollId=" + enrollId + ", enrollName=" + enrollName + ", email=" + email + "]";
	}

	public EnrollEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
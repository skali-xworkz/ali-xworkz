package com.xworkz.enroll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "enroll_table")
public class EnrollEntity implements java.io.Serializable {

	@Column(name ="ENROLL_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enrollId;
	
	@Column(name = "ENROLL_NAME")
	private String enroll_name;
	
	@Column(name = "ENROLL_EMAIL")
	private String enroll_email;

	public int getEnrollId() {
		return enrollId;
	}

	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}

	public String getEnroll_name() {
		return enroll_name;
	}
	public void setEnroll_name(String enroll_name) {
		this.enroll_name = enroll_name;
	}
	public String getEnroll_email() {
		return enroll_email;
	}
	public void setEnroll_email(String enroll_email) {
		this.enroll_email = enroll_email;
	}
	@Override
	public String toString() {
		return "EnrollEntity [enrollId=" + enrollId + ", enroll_name=" + enroll_name + ", enroll_email=" + enroll_email
				+ "]";
	}
}
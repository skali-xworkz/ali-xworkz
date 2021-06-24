package com.xworkz.river.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Table(name="river")
@Component
@Entity
@ToString
@AllArgsConstructor
public class RiverDTO  {
	@Id
	@NonNull
	@Column(name="R_ID")
	private int riverId;
	//@NonNull
	@Column(name="R_NAME")
	private String riverName;
	//@NonNull
	@Column(name="R_ORIGIN")
	private String riverOrigin;
	@NonNull
	@Column(name="R_POLLUTED")
	private int riverPolluted;
	@NonNull
	@Column(name="R_DAM_NO")
	private int riverDamNo;
	@NonNull
	@Column(name="R_LENGTH")
	private int riverLength;
	
	public RiverDTO() {
		System.out.println("Object is created" + getClass().getSimpleName());
	}
}
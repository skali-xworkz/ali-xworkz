package com.xworkz.instagram.dto;

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

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "instagram_account")

public class InstagramDTO  implements  java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "I_ID")
	private int userId;

	@NonNull
	@Column(name = "NO_OF_USERS")
	private double noOfUsers;
	
	@NonNull
	@Column(name = "VERSION")
	private double version;
	
	@NonNull
	@Column(name = "NO_OF_FEATURES")
	private int noOfFeatures;
	
	@NonNull
	@Column(name = "NET_WORTH")
	private double netWorth;
	
	@NonNull
	@Column(name = "IS_PUBLIC")
	private boolean isPublic;
	

}

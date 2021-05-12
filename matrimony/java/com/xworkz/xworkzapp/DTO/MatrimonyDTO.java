package com.xworkz.xworkzapp.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatrimonyDTO {
	private int mid;
	private String registerName;
	private Gender gender;
	private String lookingFor;
	private String qualification;
	private String habits;

	public enum Gender {
		M, F, O
	}

}

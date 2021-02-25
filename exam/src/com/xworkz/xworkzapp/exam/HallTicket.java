package com.xworkz.xworkzapp.exam;

public class HallTicket {
	public String name;
	public String usn;
	public String subjectcode;
	public HallTicket(String name, String usn, String subjectcode) {
		super();
		this.name = name;
		this.usn = usn;
		this.subjectcode = subjectcode;
	}
	public void displayInfo(){
		System.out.println(this.name);
		System.out.println(this.usn);
		System.out.println(this.subjectcode);
	}
	

}

package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.Bank;

public class Bank {
	public String name;
	public String address;
	public Bank() {
		this("SBI");
		// TODO Auto-generated constructor stub
		System.out.println("birthday Object with zero parameter is created");
	}
	public Bank(String name) {
		this(name,"Richmond Circle");
		// TODO Auto-generated constructor stub
		System.out.println("Bank object with one parameter is created");
	}
	public Bank(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		System.out.println("Bank object with two parameter is created");
	}
	public Bank EnjoyBank(){
		return this;
	}
}

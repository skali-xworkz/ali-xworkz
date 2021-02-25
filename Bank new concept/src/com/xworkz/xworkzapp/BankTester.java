package com.xworkz.xworkzapp;
public class BankTester {
	public static void main(String[] args) {
		Bank et=new Bank();
		System.out.println(et.name+" "+et.address);
		Bank et1=et.EnjoyBank();
		System.out.println(et1);
	}
}
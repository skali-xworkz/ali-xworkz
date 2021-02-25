package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.bank.BankApp;

public class BankTester {
	public static void main(String[] args) {
		BankApp ba=new BankApp();
		ba.yesbank();
		ba.setBankName("YES BANK");
		ba.setLocation("vijay_Nagar");
		System.out.println(ba.getBankName()+"\t"+ba.getLocation());
	}

}

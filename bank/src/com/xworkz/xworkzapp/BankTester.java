package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.BankDTO;

public class BankTester {
	public static void main(String a[])
	{
		BankDTO bt=new BankDTO("RBL Bank","Richmond Road",02262327777);
		System.out.println(bt.getName()+""+bt.getAddress()+""+bt.getcontactNo());
	}
}

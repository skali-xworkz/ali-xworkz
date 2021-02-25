package com.xwoorkz.xworkzapp;

import com.xwoorkz.xworkzapp.INS.Xworkz;

public class XworkzTester {
	public static void main(String[] args) {
	Xworkz xz=new Xworkz();//polymorpism,upcasting
	xz.name="XworkZ";
	xz.address="Rajajinagar";
	xz.hours="6AM-12PM";
	xz.contactNumber=8048669257L;
	System.out.println(xz.name+"\t"+xz.address+"\t"+xz.hours+"\t"+xz.contactNumber);
	xz.information();
}
}
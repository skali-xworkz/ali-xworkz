package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.mango.Mango;

public class MangoTester {
public static void main(String[] args) {
	Mango mango=new Mango();
	mango.name="Frooti";
	mango.manufacturer="Parle_Agro";
	mango.introduced=1985;
	mango.price=100;
	mango.benefits();
	System.out.println(mango.name+"\t"+mango.manufacturer+"\t"+mango.introduced+"\t"+mango.price);
}
}

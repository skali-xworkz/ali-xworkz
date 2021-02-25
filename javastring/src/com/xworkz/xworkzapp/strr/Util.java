package com.xworkz.xworkzapp.strr;
//equals method &==operator
public class Util {
	//System.out.println(this.getClass().getCanonicalName()+"object is created");
	public static void main(String[] args) {
		String s1 = "Ali";
		String s2 = "Ali";
		String s3 = new String("Ali");
		String s4 = "Roshan";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
		 System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
	}
}

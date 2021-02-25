package com.xworkz.xworkzapp.assignments;
public class Reverse {
	static String str="xworkzapp";
	static  char ch[]=str.toCharArray();
	public static void main(String a[])
	{
	String str1="";	
	for(int i=ch.length-1;i>=0;i--)
	{
		
		str1=str1+ch[i];
		
	}
	System.out.println("xworkzapp");
	System.out.println(str1);
	}
	}
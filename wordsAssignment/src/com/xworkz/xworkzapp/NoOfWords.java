package com.xworkz.xworkzapp;

public class NoOfWords {
	public static void main(String args[]){
	String str="Bangalore is also called as it hub Banglore Bangalore is capital city of karnataka";
		String[] split=str.split("\\s+");
		System.out.println("No of words : "+split.length);
	}
}




package com.xworkz.xworkzapp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Duplicates {
	public static void main(String[] args) {
		String mywords = "Bangalore is also called as it hub Bangalore city Bangalore Bangalore is capital city of karnataka";
		mywords = Arrays.stream(mywords.split("\\s+")).distinct().collect(Collectors.joining(" "));
		System.out.println(mywords);
	}
}
package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.JokerDTO;

public class JokerTester {
	public static void main(String[] args) {
		JokerDTO joker=new JokerDTO("Baba","JP.NAGAR",9876544122L);
	System.out.println(joker.getName()+"\t"+joker.getAddress()+"\t"+joker.getmobileno());
	}
}

package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WordsInString {
	public static void main(String[] args) {
		String words="Bangalore is also called as it hub Banglore recently awarded best city is capital city of karnataka";
		String words1[] = words.split(" ");
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(words1);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}


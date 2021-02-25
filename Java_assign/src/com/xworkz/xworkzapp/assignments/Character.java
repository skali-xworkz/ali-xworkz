package com.xworkz.xworkzapp.assignments;

public class Character {
	public static void main(String[] args) {
		String string = "ali ali";
		int count = 0;

		// Counts each character
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters: " + count);
	}
}

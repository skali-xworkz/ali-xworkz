package com.xworkz.vacccine.util;

public class OtpGenerator {
	public static int randomNumberGenerator(int min, int max) {

		// Generate random int value from 50 to 100
		System.out.println("Random value in int from " + min + " to " + max + ":");
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println(random_int);
		return random_int;
	}
}
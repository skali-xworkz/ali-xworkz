package com.xworkz.xworkzapp.topics;

import java.util.Scanner;

public class Soldier {
	static Scanner sc  = new Scanner(System.in);	
	public static void main(String[] args) {
		
		Soldier s = new Soldier();
		char c = ' ';
		do {
			s.protect();
			System.out.println("if you want play game press Y");
			c = sc.next().charAt(0);
		} while (c == 'y');
		System.out.println("thank you");
	}

	void protect() {
		System.out.println("number of wars  won");
		int n = sc.nextInt();
		int i = 1;
		do {
			System.out.println("welcome to INDIA");
			i++;
		} while (i <= n);
	}
}

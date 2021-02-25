package com.xworkz.xworkzapp.assign;

public class Fact {
	public static void main(String a[]) {
		int num = 5;
		fact(num);
	}

	static void fact(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;
			System.out.println(f);

		}

	}
	
	
}
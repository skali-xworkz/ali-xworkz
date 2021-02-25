package com.xworkz.xworkzapp.assign;

public class FactDo {
	public static void main(String a[]) {
		int num = 4;
		fact(num);
	}

	static void fact(int num) {
		int f = 1, i = 1;
		do {
			f = f * i;
			System.out.println(f);
			i++;
		} while (i <= num);

	}

}

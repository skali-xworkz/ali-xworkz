package com.xworkz.xworkzapp.assignments;

import java.util.Arrays;

public class CompareMulti {
	public static void main(String[] args) {
		int arra1[] = { 1, 2, 3 };
		int arra2[] = { 1, 2, 4 };

		if (Arrays.equals(arra1, arra2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}

}

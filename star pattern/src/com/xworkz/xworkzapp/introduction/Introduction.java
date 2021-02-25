package com.xworkz.xworkzapp.introduction;

public class Introduction {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(i + "" + j + "  ");
				//System.out.print("*");
			}
			System.out.println();
		}
	}
}
package com.xworkz.xworkzapp.Task;

public class Diamond {
	public static void main(String[] args) {
		int n = 5;
		int i, j, mid = n / 2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i - j == mid || i + j == mid || j - i == mid||i + j == mid*3) {
					System.out.print(i + "" + j + "");
					// System.out.print("*");
				}else
				System.out.print("   ");
			}
			System.out.println();
		}
	}
}

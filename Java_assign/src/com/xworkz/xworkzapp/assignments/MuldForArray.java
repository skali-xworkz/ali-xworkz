package com.xworkz.xworkzapp.assignments;

public class MuldForArray {
	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 60, 40, 70 }, { 140, 180, 170 } };
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("a[" + i + "][" + j + "]" + a[i][j]);
			}
			System.out.println("");
		}

	}
}
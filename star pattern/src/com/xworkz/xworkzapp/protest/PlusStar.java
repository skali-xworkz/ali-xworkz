package com.xworkz.xworkzapp.protest;

public class PlusStar {
	public static void main(String[] args) {
		int i, j,n=9;
		int mid=n/2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j||i+j==n-1||i==mid||j==mid ) 
				 System.out.print(" * ");
//		System.out.print(i + "" + j + " ");
				else
					System.out.print("   ");
			}
			System.out.println(" ");
		}
	}
}

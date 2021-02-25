package com.xworkz.xworkzapp.protest;

public class UltaEight {
	public static void main(String[] args) {
		int i, j,n=6;
		int mid=n/2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
if (i>=j&&i+j<=n-1||j>=i&&i+j>=n-1) 
//				 System.out.print(" * ");
		System.out.print(i + "" +j+" ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}
}
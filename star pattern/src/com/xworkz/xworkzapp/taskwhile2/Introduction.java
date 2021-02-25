package com.xworkz.xworkzapp.taskwhile2;

public class Introduction {
	public static void main(String[] args) {
		int i = 1,n = 5;
		while (i < n) {
			int j=1;
			while (j < n) {
				System.out.print(i + ""+j+" ");
				// System.out.print("*");

				j++;
			}
			i++;
			System.out.println();
		}	
	}
}
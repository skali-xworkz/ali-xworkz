package com.xworkz.xworkzapp.task3alpha;

public class Valphabets {
public static void main(String[] args) {
	int i, j,n=5;
	int mid=n/2;
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++){
			
			if (i == j&& mid>=i||i+j==4&&mid>=i) 
//				 System.out.print("*");
				System.out.print(i + "" + j + "  ");
			else
				System.out.print("    ");
		}
		System.out.println();
	}
}
}

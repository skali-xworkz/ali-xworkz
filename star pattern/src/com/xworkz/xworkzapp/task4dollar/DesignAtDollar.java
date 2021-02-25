package com.xworkz.xworkzapp.task4dollar;

public class DesignAtDollar {
	public static void main(String[] args) {
		int i, j, n = 5;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) 
					 System.out.print("@"+" ");
//					System.out.print(i + "" + j + "  ");
				else if (i == 0 || j == 0 ||i==n-1||j==n-1){//boundary 
					System.out.print("* ");
				} else
					System.out.print("$ ");
			}
			System.out.println();
		}
	}
}

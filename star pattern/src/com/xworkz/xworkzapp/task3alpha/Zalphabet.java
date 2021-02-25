package com.xworkz.xworkzapp.task3alpha;

public class Zalphabet {
	public static void main(String[] args) {
		int i, j,n=5;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++){
				
				if (i == 0|| i + j == n - 1||i==n-1) 
//					 System.out.print("*");
					System.out.print(i + "" + j + "  ");
				else
					System.out.print("    ");
			}
			System.out.println();
		}
	}
}


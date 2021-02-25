package com.xworkz.xworkzapp.Task;

public class ReverseLeft {//right
	public static void main(String[] args) {
		int i, j,n=5;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
			if(i+j>=n-1)//rev left angle
				//if(i+j<=n-1)//left angle
					System.out.print(i + "" + j + "  ");
				else
					System.out.print("    ");
			}
			System.out.println("     ");
		}
	}
}
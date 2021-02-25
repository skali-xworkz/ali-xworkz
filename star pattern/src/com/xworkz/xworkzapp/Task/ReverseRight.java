package com.xworkz.xworkzapp.Task;

public class ReverseRight {//left
public static void main(String[] args) {
		int i, j,n=5;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if(i<=j)//rev right Angle
					System.out.print(i + "" + j + "  ");
				 //System.out.print(" * ");
				else
					System.out.print("    ");
			}
			System.out.println("     ");
		}
	}
}

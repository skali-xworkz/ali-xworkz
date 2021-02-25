package com.xworkz.xworkzapp.Task;

public class TriangleUp {
	public static void main(String[] args) {
		int i, j, n = 10, mid = n / 2;
		for (i = 0; i <= mid; i++) {
			for (j = 0; j < n; j++) {
				if (i + j == mid)
//					System.out.print( " *" + " ");
					System.out.print(i + "" + j + " ");

				else if (i == mid)
//					System.out.print( " *" + " ");
					System.out.print(i + "" + j + " ");
				else if (i == 1 && j==3)
//					System.out.print( " *" + " ");
					System.out.print(i + "" + j + " ");
				else
					System.out.print(" # ");
			}
			System.out.println();
		}
	}
}

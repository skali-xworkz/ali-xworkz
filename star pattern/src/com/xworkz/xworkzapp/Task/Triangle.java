package com.xworkz.xworkzapp.Task;

public class Triangle {
	public static void main(String[] args) {
		int i, j, n = 5, mid = n / 2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)		{
				if (i + j == 4 && i >= mid)
					// System.out.print( " *" + " ");
					System.out.print(i + "" + j + "  ");
				else if (i == j && i >= mid)
					System.out.print(i + "" + j + "  ");
				// System.out.print( " *" + " ");
				else if (i == 4)
					System.out.print(i + "" + j + "  ");
				// System.out.print( " *" + " ");
				else
					System.out.print("    ");
			}
			System.out.println("     ");
		}
	}
}

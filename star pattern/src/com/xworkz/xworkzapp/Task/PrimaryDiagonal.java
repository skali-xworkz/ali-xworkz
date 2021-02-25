package com.xworkz.xworkzapp.Task;

public class PrimaryDiagonal {
	public static void main(String[] args) {
		int i, j,n=5;
		for (i = 1; i < n; i++) {
			for (j = 1; j < n; j++) {
			//if (i == j)
			//	if(i+j==4)
				if (i == j || i+j==4) //At time we can use logical OR operator this is first diagonal i==j & secondary diagonal i+j=4*/
					// System.out.print( "*");
		System.out.print(i + "" + j + "  ");
				else
					System.out.print("    ");
			}
			System.out.println("     ");
		}
	}
}

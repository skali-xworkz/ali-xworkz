package com.xworkz.xworkzapp.task3alpha;

public class Galphabet {

public static void main(String[] args) {
		
		int n=5,mid=n/2;
		  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (i==0 && j!=n-1 || j==0 || i==n-1 && j!=n-2 && j!=n-1 || j==n-3 && i!=n-4 || j==n-2 && i!=n-4  ) {

						 System.out.print(i +""+ j +" ");
//						System.out.print(" *");
					} else {

					System.out.print("   ");
				}
			}
			System.out.println();
			}
	}
	
	
	
	
	
	
	
}

package com.xworkz.xworkzapp.task3alpha;

public class Ealphabet {

public static void main(String[] args) {
		
		int n=5;
		int mid=n/2;
		  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (i==0 || i==n-1 || j==0 || i==mid) {

//						 System.out.print(i +""+ j +" ");
						System.out.print(" *");
					} else {

					System.out.print("   ");
				}
			}
			System.out.println();
			}
	}
	
	
	
	
	
}

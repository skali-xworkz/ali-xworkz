package com.xworkz.xworkzapp.task3alpha;

public class Kalphabets {
	public static void main(String[] args) {
        int n=5;
		int mid=n/2;;
		  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (j==0||i==2&&mid>=j||i+j==4&&mid>=i||i==j&&mid<=j) {

						 System.out.print(i +""+ j +" ");
//						System.out.print(" *");
					} else {

					System.out.print("  ");
				}
			}
			System.out.println();
			}
	}
	
	
}

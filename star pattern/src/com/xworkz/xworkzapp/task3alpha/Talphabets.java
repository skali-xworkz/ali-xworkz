package com.xworkz.xworkzapp.task3alpha;

public class Talphabets {
public static void main(String[] args) {        
		int n=5,mid=n/2;
		  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (i == 0 || j == mid) {

						// System.out.print(i +""+ j +" ");
						System.out.print(" *");
					} else {

					System.out.print("  ");
				}
			}
			System.out.println();
			}
	}
}

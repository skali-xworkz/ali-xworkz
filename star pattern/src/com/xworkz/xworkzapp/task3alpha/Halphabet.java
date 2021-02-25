package com.xworkz.xworkzapp.task3alpha;

public class Halphabet {

public static void main(String[] args) {
        int n=5;
		int mid=n/2;;
		  for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					if (j==0 ||  i==mid  || j==4) {

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

package com.xworkz.xworkzapp.Task;
public class Apple {
	public static void main(String[] args) {
		Apple a1=new Apple();
	a1.app();
	System.out.println();
		a1.app2();
	System.out.println();
		a1.app3();
	System.out.println();
	}
		void app(){
			int i, j, n = 5;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0||j==n-1||i==2) {
//					System.out.print(i + "" + j + " ");
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
		void app2(){
			int i, j,n = 5;
			int mid=n/2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == 0&&i!=0||i==mid||j==n-1&&i!=0||i==0&&j!=0&&j!=n-1 ) {
//					System.out.print(i + "" + j + " ");                                                                                                                                                                      				System.out.print(i + "" + j + " ");
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  \n");
	}
		void app3(){
			int i=1,j=1,n=5,mid=n/2;
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(i+j==mid||j-i==mid||i==mid||j==0&&i!=0&&i!=mid-1||j==n-1&&i!=0&&i!=1){
//						System.out.print(i + "" + j + " ");
					System.out.print("  *");
				     }
					else{
						System.out.print("   ");
					    }
				}
				System.out.println();
			}		
			}
		}

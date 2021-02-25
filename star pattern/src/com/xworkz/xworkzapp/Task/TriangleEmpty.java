package com.xworkz.xworkzapp.Task;

public class TriangleEmpty {
	public static void main(String[] args) {
		TriangleEmpty te=new TriangleEmpty();
		te.triangle(5);
		//te.revTriangle(5);
	}
		void triangle(int n){
		int i=1,j=1,mid=n/2;
		for(i=0;i<n/2+1;i++){
			for(j=0;j<n;j++){
				if(i+j==mid||j-i==mid||i==mid){
					System.out.print(i + "" + j + " ");
//				System.out.print("  *");
			     }
				else{
					System.out.print("   ");
				    }
			}
			System.out.println();
		}		
		}
		void revTriangle(int n)
		{
			int mid=n/2;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==mid||i-j==mid||i+j==mid*3){
//					System.out.print(i + "" + j + " ");
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
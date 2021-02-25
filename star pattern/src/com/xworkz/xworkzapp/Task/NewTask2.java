package com.xworkz.xworkzapp.Task;

public class NewTask2 {
	public static void main(String[] args) {
		int i,j,n=5;
		for (i=1;i<=n;i++){
			for (j=1;j<=n;j++){
				if(i+j==n+1||j==n||i==n)
				{
					System.out.print(i+""+j+" ");//3space
					//System.out.print("  * ");//2space
				}
				else
				{
					System.out.print("   ");//5space
					//System.out.print("");//5space *
				}	
			}
			System.out.println();
		}		
	}
}

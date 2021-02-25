package com.xworkz.xworkzapp.alphabets;

public class Bat {
public static void main(String[] args) {
	int i,j,n=5;
	int mid=n/2;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++){
			if(j==0||i==0||j==n-1)
			//if(j==n-1||j==0||i==0||i==n||i==mid||j==n||i==n-1)
			System.out.print(i+""+j+" ");
		
		}
		System.out.println("     ");
	}
	System.out.print(" ");
}
}

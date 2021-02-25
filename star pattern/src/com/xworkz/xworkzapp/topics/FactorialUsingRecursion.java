package com.xworkz.xworkzapp.topics;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		FactorialUsingRecursion f1=new FactorialUsingRecursion();
		f1.factorial(5,1);
	}	
	
int factorial=1;
void factorial(int i,int n)
{
	if(n<=i){
		factorial=factorial*n;
		factorial(i,n+1);
	}else
		System.out.println(factorial);
	}
}

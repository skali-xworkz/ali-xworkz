package com.xworkz.xworkzapp.topics;

public class FibonacciWithRecursion {
	public static void main(String[] args) {
		FibonacciWithRecursion fb = new FibonacciWithRecursion();
		//fb.fibonacci();
		fb.fibonacci(0,1,14);

	}

	void fibonacci() {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.println(a + " ");
			sum = a + b;
			a = b;
			b = sum;

		}
	}

void fibonacci(int a,int b,int lastIndex)
{
	if(a<=lastIndex){
		System.out.println(a+"");
		int sum=a+b;
		a=b;
		b=sum;
		fibonacci(a,b,lastIndex);
	}
}
}
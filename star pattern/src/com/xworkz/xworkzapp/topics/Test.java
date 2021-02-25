package com.xworkz.xworkzapp.topics;

public class Test {
	public static void main(String[] args) {
		FibonacciWithRecursion fb = new FibonacciWithRecursion();
		//Test t=new Test();
		 fb.fibonacci();
		//t.fibonacci();
		//fb.fibonacci(0, 1, 5);

	}

	void fibonacci() {
		int a = 0,i;
		int b = 1;
		int sum = 0;
		while (i < 0) {
				System.out.println(a + " ");
				sum = a + b;
				a = b;
				b = sum;
			}
		}
}

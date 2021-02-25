package com.xworkz.xworkzapp.topics;

public class FibWhile {
	public static void main(String[] args) {
		FibWhile fb = new FibWhile();
		//fb.fibonacci();
		fb.fibonacci(0,1,5);

	}
	void fibonacci() {
		int a = 0;
		int b = 1;
		int sum = 0;
		while(a<=5){
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

package com.ali.aliapp.practice;

public class AliBox {
	static void box(){//box method p->W
		//boxing
		float f=400.0f;
		Float f1=new Float(f);
		System.out.println("box called");
		System.out.println(f1);	
	}
	static void unbox()//unbox method function W->P
	{
		Float f2=890.0f;
		float ff1=f2.floatValue();
		System.out.println("unbox called");
		System.out.println(ff1);
		
	}
	static void autoBoxing()//p>w
	{
		System.out.println("autoBoxing calling");
		int i=12;
		Integer a=i;
		System.out.println(a);
	}
	static void autoUnBoxing()//w->p
	{
		System.out.println("auto____UNBoxing calling");
		Integer i=100;
		int i1=i;
		System.out.println(i1);
	}
	public static void main(String[] args) {
		System.out.println("Inside main method");
		box();
		unbox();
		autoBoxing();
		autoUnBoxing();
}
}
package com.xworkz.xworkzapp.assignments;


public class Method {
	public int sum(int a,int b){
		return a+b;
	}
	public float sum(float a,float b){
		return a-b ;
	}
	public long sum(long a,long b){
		return a*b;
	}
	public double sum(double a,double b){
		return a/b;
	}	
	 public void sum(byte b) 
	    { 
	        System.out.println("In byte\t"+b); 
	    } 
	 public void sum(short a) 
	    { 
	        System.out.println("In short\t"+a); 
	    }
	 public String[] sum(String bike[])
	 {
		return bike;
	 }
	public static void main(String[] args) {
		byte a=25;
		short b=100;
		Method md=new Method();
		md.sum(a);//it will go to byte argument;
		
		md.sum(b);//it will go to short argument;
		
		int intsum=md.sum(5,5);
		System.out.println(intsum);
		float floatsum=md.sum(6f,4f);
		System.out.println(floatsum);
		long longsum=md.sum(50L,3L);
		System.out.println(longsum);
		double doublesum=md.sum(100d,10d);
		System.out.println(doublesum);
		//md.sum("hero Honda,KTM,Royal Enfield Bullet");
		String bike[]={"hero Honda,KTM,Royal Enfield Bullet"};
		md.sum(bike);
		System.out.println(bike[0]);
	}
}








/*public short show(short s){
	System.out.println(s);
	return s;
}
public byte show(byte a){
		return a=125;
}*/
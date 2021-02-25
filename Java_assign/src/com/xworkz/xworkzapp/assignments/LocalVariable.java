package com.xworkz.xworkzapp.assignments;

public class LocalVariable {
void add(){
	int x,y=10,z=20;//declaring Local variable
	x=y+z;
	System.out.println("sum:"+x);
}
public static void main(String[] args) {
	LocalVariable lv=new LocalVariable();
	lv.add();
}
}

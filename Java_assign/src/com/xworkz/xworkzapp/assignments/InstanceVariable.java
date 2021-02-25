package com.xworkz.xworkzapp.assignments;

public class InstanceVariable {
	//instance variable  can be use in functions or methods
int x,y=20,z=30;//declaring instance variable
void add(){
	x=y+z;	//accessing instance variable
	System.out.println("adding two no X:"+x);
}
void mul()
{
	x=y*z;
	System.out.println("multiplying two no X:"+x);
}
public static void main(String[] args) {
	InstanceVariable iv=new InstanceVariable();
	iv.add();
	iv.mul();
}
}


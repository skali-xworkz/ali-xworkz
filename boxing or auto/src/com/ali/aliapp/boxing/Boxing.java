package com.ali.aliapp.boxing;

public class Boxing {
public static void main(String[] args) {
int i=10;
Integer integer=new Integer(i);//Boxing
System.out.println(integer);//Boxing
int integer1=integer.intValue();//unboxing
System.out.println(integer1);



float f=100.0f;
//boxing
Float float1= new Float(f);
System.out.println(float1);
//unboxing
float g=float1.floatValue();
System.out.println(g);

double ali=356.0;
//autoboxing
Double double1=ali;
System.out.println(double1);
//auto unboxing
double d=double1;
System.out.println(d);

//unboxing
Integer aa=2974376;
int j=aa;//.intValue();//we can't use ****Value() this is autoboxing
System.out.println(j);
}
}
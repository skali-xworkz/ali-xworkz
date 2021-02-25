package com.ali.aliapp.boxing;

public class Box {
public static void main(String[] args) {
	char c='B'; //BOXING
	Character character=new Character(c);
	System.out.println(character+"\tauto-boxing");
	//auto-boxing
	double price=90.00;
	Double dou = price;
	System.out.println(dou+"\t");
	//UN-boxing
	char c1=character.charValue();
	System.out.println(c1+"\t unboxing");
	//auto un-boxing
	Double value=dou.doubleValue();
	System.out.println(value+"\tauto un-boxing");
}
}
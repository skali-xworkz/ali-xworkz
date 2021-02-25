package com.xworkz.xworkzapp.strr;

public class UttilSir {
public static void main(String[] args) {
	//string literals
	String name="KRS";//one instance is created
	String nm1="KRS";//one instance is created
	System.out.println(name.equals(nm1));
	System.out.println(name==nm1);
	
	String nm=new String("KRS");//references and values same if became true
	System.out.println(name.equals(nm));
	System.out.println(name==nm);
	
	String baba=new String("KRS");
	System.out.println(nm==baba);
	
	StringBuilder buffer=new StringBuilder("Samanth");
	buffer.append(" m");
	System.out.println(buffer);
	
}
}

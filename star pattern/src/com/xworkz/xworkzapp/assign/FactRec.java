package com.xworkz.xworkzapp.assign;

public class FactRec {
	public static void main(String a[]) {
		FactRec fr=new FactRec();
		int num=5;
		int f=1;
		int i=1;
		fr.fact(num,f,i);
	}

	public void fact(int num,int f,int i) {
		if(i<=num){
		//for (i = 1; i <= num; i++) {
			System.out.println(f);
			i++;
			f = f * i;
			fact(num,f,i);
		}
	}
}
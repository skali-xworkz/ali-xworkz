package com.xworkz.xworkzapp.topics;

import com.xworkz.xworkzapp.assign.FactRec;

public class FactRec {
	public static void main(String a[]) {
		FactRec fr = new FactRec();
		int num = 5;
		int f = 1;
		int i = 1;
		//int fq;
		int fact1 = fr.fact(num, f, i);
		System.out.println(fact1);
	}
	
	public int fact(int num, int f, int i) {
		
		if (i <= num) {
			i++;
			f = f * i;
			
			 f=fact(num, f, i);
		}
		return f;

	}

}

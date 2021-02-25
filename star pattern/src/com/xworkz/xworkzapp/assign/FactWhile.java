package com.xworkz.xworkzapp.assign;

public class FactWhile {
	public static void main(String a[]) {
		int num = 6;
		fact(num);
	}

	static void fact(int num) {
		int f = 1,i=1;
		while(i<=num){
			f = f * i;
			System.out.println(f);
			i++;
		}

		}

	}

package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.laptop.Laptop;
import com.xworkz.xworkzapp.laptop.Lenovo;

public class LenovoTester {
	public static void main(String[] args) {
		Laptop lenovo=new Lenovo();
				lenovo.BrandName="LENOVO";
				lenovo.ModelName="L430";
				lenovo.year=2021;
				lenovo.RAMSize="16GB";
				lenovo.HDDSize="1TB";
				lenovo.price=95000;
				lenovo.features();
System.out.println(lenovo.BrandName+"\t"+lenovo.ModelName+"\t"+lenovo.year+"\t"+lenovo.RAMSize+"\t"+lenovo.HDDSize+"\t"+lenovo.price);
			
	}
}

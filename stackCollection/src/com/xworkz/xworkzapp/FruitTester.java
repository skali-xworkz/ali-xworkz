package com.xworkz.xworkzapp;

import java.util.Stack;

import com.xworkz.xworkzapp.dao.FruitDao;
import com.xworkz.xworkzapp.dao.FruitDaoImp;
import com.xworkz.xworkzapp.dto.FruitDto;

public class FruitTester {
public static void main(String[] args) {
	FruitDto fdt1=new FruitDto("Apple", "red", 100);
	FruitDto fdt2=new FruitDto("mango", "yellow", 200);
	FruitDto fdt3=new FruitDto("grapes", "Black", 300);
	FruitDto fdt4=new FruitDto("orange", "orange", 500);
	FruitDao fd=new FruitDaoImp();
	//fd.addFruit(fdt1);
	fd.addFruit(fdt2);
	fd.addFruit(fdt3);
	fd.addFruit(fdt4);
	fd.addFruit(fdt1);
	fd.removeFruit();
	

	fd.display();
	


}
}

package com.xworkz.xworkzapp.dao;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.xworkzapp.dto.FruitDto;

public class FruitDaoImp implements FruitDao {
	LinkedList fruitsAdd=new LinkedList();  
	@Override
	public void addFruit(FruitDto dto) {
		// TODO Auto-generated method stub
		fruitsAdd.push(dto);
		System.out.println("added succesfully");
		//System.out.println("Fruit size:"+fruitsAdd.size());
	}

	@Override
	public void removeFruit() {
		// TODO Auto-generated method stub
		fruitsAdd.pop();
		System.out.println("removed succesfully");
		System.out.println(fruitsAdd.size());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (Iterator iterator = fruitsAdd.iterator(); iterator.hasNext();) {
			FruitDto dto = (FruitDto) iterator.next();//down casting
			System.out.println("***************************");
			System.out.println("fruit name:"+dto.getFruitName());
			System.out.println("fruit color:"+dto.getColor());
			System.out.println("fruit price:"+dto.getPrice());
			System.out.println("***************************");
		} 
		
	}

}

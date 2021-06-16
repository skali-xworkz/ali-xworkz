package com.xworkz.market;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarketTester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		SuperMarket superMarket = container.getBean(SuperMarket.class);
		System.out.println(superMarket);
	
	
	}
}



















/*  Worker worker = new Worker("ramu", 23, "male",7345662291L);
 
  Address address = new Address("mini market", 3, 153, 56001, "shivaj nagar");
 
  SuperMarket superMarket = new SuperMarket("BigBazar", 5, address, 7, worker);
  System.out.println(superMarket);*/

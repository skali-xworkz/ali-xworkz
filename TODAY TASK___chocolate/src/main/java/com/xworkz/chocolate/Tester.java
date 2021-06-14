package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springXml = "spring.Xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springXml);
		
		Chocolate choclate = container.getBean(Chocolate.class);
		System.out.println(choclate);
		
		Database db = container.getBean(Database.class);
		System.out.println(db);
		
	}
}

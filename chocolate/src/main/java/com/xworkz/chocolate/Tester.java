package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {
	
	
			String springXml = "spring.Xml";
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.Xml");
		chocolate choclate = container.getBean(chocolate.class);
		// choclate.setBrand("cadbury");
		// choclate.setName("dairy milk");
		// choclate.setPrice(75);
		// choclate.setSize("small");
		System.out.println(choclate);
		choclate.taste();
		choclate.stressReliver();
		System.out.println("Choclate Brand :"+choclate.getBrand()+"\nChoclate Price :" + choclate.getPrice());
	}
}

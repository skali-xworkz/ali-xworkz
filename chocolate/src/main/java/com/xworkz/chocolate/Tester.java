package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {
	
	
	String springXml="spring.Xml";
	ApplicationContext container=new ClassPathXmlApplicationContext("spring.Xml");
	chocolate choclate=container.getBean(chocolate.class);
	choclate.setBrand("cadbury");
	choclate.setName("dairy milk");
	choclate.setPrice(100.8);
	choclate.setSize("small");
	
	choclate.taste();
	choclate.stressReliver();
}
}

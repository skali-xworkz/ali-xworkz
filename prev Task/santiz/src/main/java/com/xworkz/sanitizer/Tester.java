package com.xworkz.sanitizer;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		Sanitizer sanitizer = container.getBean(Sanitizer.class);
		System.out.println(sanitizer);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
		System.out.println("container is closed");
	}
}
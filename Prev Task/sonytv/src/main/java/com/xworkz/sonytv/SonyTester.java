package com.xworkz.sonytv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.xworkz.sonytv.dao.SonyTVDAOImpl;
import com.xworkz.sonytv.dto.SonyTVDTO;

public class SonyTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		//String springXml = "ApplicationContext.xml";
		//ApplicationContext container = new ClassPathXmlApplicationContext(springXml);		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SonyTVDAOImpl bean = applicationContext.getBean(SonyTVDAOImpl.class);
		
		SonyTVDTO std = new SonyTVDTO("sonyBravia", 125000);
		bean.saveSonyTv(std);
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
		System.out.println("program ended");
		classPathXmlApplicationContext.close();

	}

}

package com.xworkz.river;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.river.dao.RiverDAOImpl;
import com.xworkz.river.dto.RiverDTO;
import com.xworkz.river.service.RiverService;
import com.xworkz.river.service.RiverServiceImpl;

public class RiverTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RiverDTO rdt = new RiverDTO(1,"Ganga","Varanasi", 1, 4, 1500);
		RiverService service = context.getBean(RiverServiceImpl.class);
		service.riverValidDeatils(rdt);
		System.out.println(rdt);
		System.out.println("program ended");
	}
}
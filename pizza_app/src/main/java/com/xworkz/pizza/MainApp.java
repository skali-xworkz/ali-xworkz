package com.xworkz.pizza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class MainApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();// creating configuration
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();// creating session factory object
		Session session = sessionFactory.openSession();// creating session object (Auto_commit mode false)
		PizzaHutDTO pizzaHutDTO = new PizzaHutDTO("Tandoori_Paneer", "Forum_Mall_Koramangala", 449, true, "Large","veg");
		Transaction transaction = session.beginTransaction();// compulsory required transaction if we didn't write this line code(transaction) it will take auto_commit mode false.
		session.save(pizzaHutDTO);// just it will write query it will save but the data should be saved permanently..So Next line code is very important.
		transaction.commit();
	}

}










// don't copy any comments just understanding My purpose only...!
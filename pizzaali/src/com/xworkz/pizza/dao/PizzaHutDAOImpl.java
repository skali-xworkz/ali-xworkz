package com.xworkz.pizza.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class PizzaHutDAOImpl implements PizzaHutDAO {

	public void save(PizzaHutDTO dto) {
		System.out.println("inside save method");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction trasaction = null;
		try {
			Configuration configuration = new Configuration();// creating
																// configuration
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			trasaction = session.beginTransaction();
			session.save(dto);
			trasaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			//trasaction.rollback();

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session Closed");
			} else {
				System.out.println("Seesion connection failed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("Session Factory closed");
			} else {
				System.out.println("Session Factory Connection failed");
			}
		}
	}
	public List<PizzaHutDTO> loadAllPizzaRecords() {
		System.out.println("fetch All PizzaHutDTO Records");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getAllRecords");
			List<PizzaHutDTO> list = query.list();
			for (PizzaHutDTO dto : list) {
				System.out.println(dto);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				System.out.println("Session closed.........");
				session.close();
			} else {
				System.out.println("Session not Closed.......");
			}
		}
		return null;
	}
}
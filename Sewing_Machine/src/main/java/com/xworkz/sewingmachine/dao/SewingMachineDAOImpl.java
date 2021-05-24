package com.xworkz.sewingmachine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sewingmachine.dto.SewingMachineDTO;

public class SewingMachineDAOImpl implements SewingMachineDAO {

	@Override
	public void saveSewingMachine(SewingMachineDTO dto) {
		System.out.println("inside save method");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction trasaction = null;
		try {
			Configuration configuration = new Configuration();// creating configuration
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			trasaction = session.beginTransaction();
			session.persist(dto);
			trasaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			trasaction.rollback();

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
	@Override
	public void fetchSewingMachineDetails() {

		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 4);
			System.out.println(machineDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}
		if (sessionFactory != null) {
			sessionFactory.close();
			System.out.println("SessionFactory is Closed");

		} else {
			System.out.println("SessionFactory is not Closed");
		}
	}

}

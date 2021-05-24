package com.xworkz.instagram.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO {

	@Override
	public void saveInstagramDTO(InstagramDTO dto) {
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
				System.out.println("Session closed");
			} else {
				System.out.println("Seesion connection failed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("Session factory closed");
			} else {
				System.out.println("Session factory connection failed");
			}
		}
	}


	@Override
	public void fetchInstagramDetails() {
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			InstagramDTO instagramDTO = session.get(InstagramDTO.class, 6);
			System.out.println(instagramDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (session != null) {
				session.close();
				System.out.println("Session is Closed");

			} else {
				System.out.println("Session is not Closed");
			}

			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("SessionFactory is Closed");
			} else {
				System.out.println("SessionFactory is not Closed");
			}
		}		
	}

}

package com.xworkz.amazon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.amazon.entity.AmazonEntity;

@Component
public class AmazonDAOImpl implements AmazonDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public AmazonDAOImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	public boolean saveRegisterAmazon(AmazonEntity amazonEntity) {
		System.out.println("save method started");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(amazonEntity);
			session.getTransaction().commit();
			System.out.println("amazon data saved");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			System.out.println("data is not saved...error try again");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}
		return false;
	}

}

package com.xworkz.enroll.dao;

import com.xworkz.enroll.entity.EnrollEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnrollDAOImpl implements EnrollDAO {
	@Autowired
	private SessionFactory factory;

	public EnrollDAOImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	@Override
	public boolean saveEnrollDTO(EnrollEntity enrollEntity) {
		System.out.println("Save Method started");
		Session session = this.factory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.save(enrollEntity);
			transaction.commit();
			System.out.println("data is saved in SQL successfully");
			return true;
		} catch (Exception exp) {
			session.getTransaction().rollback();
			System.out.println("data is not saved,rolling back");
		} finally {
			if (session != null) {
				System.out.println("Session Closed");
				session.close();
			} else {
				System.out.println("Session not closed");
			}
		}
		return false;
	}

}

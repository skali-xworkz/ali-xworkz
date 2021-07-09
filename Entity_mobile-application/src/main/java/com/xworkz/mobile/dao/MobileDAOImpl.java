package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileDAOImpl implements MobileDAO {
	@Autowired
	private SessionFactory factory;

	public MobileDAOImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	public MobileDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}
	@Override
	public boolean saveMobileDTO(MobileEntity mobileEntity) {
		System.out.println("Save Method started");
		Transaction transaction = null;
		Session session = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(mobileEntity);
			transaction.commit();
			System.out.println("data is saved in SQL succesully");
			return true;
		} catch (Exception exp) {
			exp.printStackTrace();
			transaction.rollback();
			System.out.println("data is not saved,rolling back");
			return false;

		} finally {
			if (session != null) {
				System.out.println("Session Closed");
				session.close();
			} else {
				System.out.println("Session not closed");
			}
		}

	}

}
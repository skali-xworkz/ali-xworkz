package com.xworkz.sonytv.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.sonytv.dto.SonyTVDTO;

public class SonyTVDAOImpl implements SonyTVDAO {

	private SessionFactory sessionFactory;

	public SonyTVDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveSonyTv(SonyTVDTO dto) {
		Session openSession = null;
		try {
			openSession = sessionFactory.openSession();
			openSession.getTransaction().begin();
			openSession.save(dto);
			openSession.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			openSession.getTransaction().rollback();
		} finally {
			if (openSession != null) {
				System.out.println("openSession.closed... ");
			} else {
				System.out.println("openSession not closed...");
			}

		}

	}

}
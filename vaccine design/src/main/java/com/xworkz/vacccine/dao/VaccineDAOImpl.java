package com.xworkz.vacccine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.QueryProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vacccine.entity.VaccineEntity;

@Component
public class VaccineDAOImpl implements VaccineDAO {
	@Autowired
	private SessionFactory factory;

	public   VaccineDAOImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	public boolean saveVaccineDTO(VaccineEntity vaccineEntity) {
		System.out.println("Save Method started");
		Session session = this.factory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.save(vaccineEntity);
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

	@Override
	public VaccineEntity getEmailByEntity(String email,String password) {
		VaccineEntity enrollEntity = null;
		Object session = null;
		try {
			session = this.factory.openSession();
			Query<VaccineEntity> query = ((QueryProducer) session).createNamedQuery("GetRecordByMail");
			query.setParameter("em", email);
			query.setParameter("e", password);
			enrollEntity = (VaccineEntity) query.uniqueResult();
			return enrollEntity;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("You have an exception " + e.getMessage());
			return null;
		} finally {
			if (session != null) {
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

	}

}
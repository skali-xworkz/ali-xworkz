package com.xworkz.vacccine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vacccine.entity.VaccineEntity;

@Component
public class VaccineDAOImpl implements VaccineDAO {
	@Autowired
	private SessionFactory factory;

	public VaccineDAOImpl() {
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

}
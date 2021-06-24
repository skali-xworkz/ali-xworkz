package com.xworkz.river.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.river.dto.RiverDTO;

@Component
public class RiverDAOImpl implements RiverDAO {
	@Autowired
	private SessionFactory factory;

	public RiverDAOImpl(SessionFactory factory) {
		this.factory = factory;

	}

	public void saveRiverDTO(RiverDTO dto) {
		System.out.println("Save Method started");
		Session openSession = null;
		try {
			openSession = factory.openSession();
			openSession.getTransaction().begin();
			openSession.save(dto);
			openSession.getTransaction().commit();

		} catch (Exception traace) {
			traace.printStackTrace();
		} finally {
			if (openSession != null) {
				System.out.println("Session Closed");
				openSession.close();
			}
		}

	}

}
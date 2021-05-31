package com.xworkz.pizza.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class PizzaHutDAOImpl implements PizzaHutDAO {

	@Override
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
	public void getPizza() {
		System.out.println("inside getpizza method....");
		SessionFactory sessionFactory = null;
		Session openSession = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			openSession = sessionFactory.openSession();
			PizzaHutDTO pizza = openSession.get(PizzaHutDTO.class, 5);
			System.out.println(pizza.toString());

		} catch (Exception exception) {
			exception.printStackTrace();

		} finally {
			if (openSession != null) {
				openSession.close();
				System.out.println("Session connection closed");
			} else {
				System.out.println("Session connection Failed");
			}

			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("Session Factory connection closed");
			} else {
				System.out.println("Session connection failed");
			}
		}
	}

	@Override
	public void updatePizzaHut() {
		System.out.println("updatePizzaHut started");
		Session session = null;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			PizzaHutDTO pizzaHutDTO = session.get(PizzaHutDTO.class, 2);
			pizzaHutDTO.setName("Peppy panner");
			pizzaHutDTO.setPrice(499);

			transaction = session.beginTransaction();
			session.update(pizzaHutDTO);
			transaction.commit();
			System.out.println("update is done");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		}
	}

	@Override
	public void deletePizzaHut() {
		System.out.println("delete started");
		Session session = null;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			PizzaHutDTO pizzaHutDTO = session.get(PizzaHutDTO.class, 2);
			transaction = session.beginTransaction();
			session.delete(pizzaHutDTO);
			transaction.commit();
			System.out.println("deleted succesfully");
		}

		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		finally {
			if (session != null) {
				session.close();
				System.out.println("Session connection closed");
			} else {
				System.out.println("Session connection not closed");
			}

		}
	}

	@Override
	public void loadAllPizzaRecords() {
		System.out.println("fetch All PizzaHutDTO Records");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getAllRecords");
			List<PizzaHutDTO> list = query.list();
			for (PizzaHutDTO headPhoneDTO : list) {
				System.out.println(headPhoneDTO);
			}

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
	}

	@Override
	public void getPizzaPriceByName(String pizzaName) {
		System.out.println("invoked getPizzaPriceByName");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			// String hql = "select p.price from PizzaHutDTO AS p where
			// p.name='"+ pizzaName +"'"; // concatination
			Query query = session.createNamedQuery("getPriceByName");
			query.setParameter("pizzaname", pizzaName);
			List list = query.list();
			System.out.println(list);

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
	}

	@Override
	public void loadFirstResultAndMaxResult() {
		System.out.println("invoked load_First_Pizza_Record");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("loadFirstResultAndMaxResult");
			List list = query.list();
			System.out.println(list);

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
	}

	@Override
	public void getTotalPriceOfAllPizza() {
		System.out.println("invoked get_Total_Price_Of_All_Pizza");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("sumOfAllPizza");
			List list = query.list();
			System.out.println(list);

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
	}

	@Override
	public void getMaxPriceOfPizza() {
		System.out.println("getMaxPriceOfPizza");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getMaxPriceOfPizza");
			List list = query.list();
			System.out.println(list);

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
	}

	@Override
	public void getMinPriceOfPizza() {
		System.out.println("get_Min_Price_Of_Pizza");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getMinPriceOfPizza");
			List list = query.list();
			System.out.println(list);

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
	}

	@Override
	public void getAvgPriceOfPizza() {
		System.out.println("get_Avg_Price_Of_Pizza");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getAvgPriceOfPizza");
			List list = query.list();
			System.out.println(list);

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
	}

}
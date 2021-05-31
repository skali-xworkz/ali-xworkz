package com.xworkz.pizza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dao.PizzaHutDAO;
import com.xworkz.pizza.dao.PizzaHutDAOImpl;
import com.xworkz.pizza.dto.PizzaHutDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		PizzaHutDTO pizzaHutDTO = new PizzaHutDTO("Tandoori", "Forum_Mall_Koramangala", 449, true, "Large", "veg");
		PizzaHutDAO daoImple = new PizzaHutDAOImpl();
		PizzaService pizzaServiceImple = new PizzaServiceImpl();
		boolean validPizzaData = pizzaServiceImple.validPizzaData(pizzaHutDTO);
		if (validPizzaData == true) {
			daoImple.save(pizzaHutDTO);
			System.out.println("inside validate data ..." + validPizzaData);
		} else {
			System.out.println("Please enter valid data ......");
		}
		daoImple.getPizza();
		daoImple.updatePizzaHut();
		daoImple.deletePizzaHut();
		daoImple.loadAllPizzaRecords();
		daoImple.getPizzaPriceByName("Tandoori");
		daoImple.loadFirstResultAndMaxResult();
		daoImple.getTotalPriceOfAllPizza();
		daoImple.getMaxPriceOfPizza();
		daoImple.getMinPriceOfPizza();
		daoImple.getAvgPriceOfPizza();
		System.out.println("*************** Program end ***************************");
	}

}

package com.xworkz.pizza.dao;

import com.xworkz.pizza.dto.PizzaHutDTO;

public interface PizzaHutDAO {
	public void save(PizzaHutDTO dto);

	public void getPizza();

	public void updatePizzaHut();

	public void deletePizzaHut();

	public void loadAllPizzaRecords();

	public void getPizzaPriceByName(String pizzaName);

	public void loadFirstResultAndMaxResult();

	public void getTotalPriceOfAllPizza();

	public void getMaxPriceOfPizza();

	public void getMinPriceOfPizza();

	public void getAvgPriceOfPizza();
}

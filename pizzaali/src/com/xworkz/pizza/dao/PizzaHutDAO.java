package com.xworkz.pizza.dao;

import java.util.List;

import com.xworkz.pizza.dto.PizzaHutDTO;

public interface PizzaHutDAO {
	public void save(PizzaHutDTO dto);
	public List<PizzaHutDTO> loadAllPizzaRecords();

}

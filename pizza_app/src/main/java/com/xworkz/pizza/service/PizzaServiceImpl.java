package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validPizzaData(PizzaHutDTO dto) {
		System.out.println("inside service imple  validPizzaData()...");

		if (dto.getName() != null && dto.getName().length() >= 4)
			return true;
		if (dto.getPrice() != 0)
			return true;
		if (dto.getType() != null && dto.getType().length() >= 2)
			return true;
		if (dto.getLocation() != null && dto.getLocation().length() >= 3)
			return true;

		return true;

	}

}

package com.xworkz.sewingmachine.service;

import com.xworkz.sewingmachine.dao.SewingMachineDAO;
import com.xworkz.sewingmachine.dao.SewingMachineDAOImpl;
import com.xworkz.sewingmachine.dto.SewingMachineDTO;

public class SewingMachineServiceImpl implements SewingMachineService {

	SewingMachineDAO impl = new SewingMachineDAOImpl();

	@Override
	public void validateSewingMachineDTO(SewingMachineDTO dto) {

		Boolean flag = true;

		if (dto.getName() == null || dto.getName().length() < 4) {
			System.out.println("Invalid SewingMachine Name");
			flag = false;
		}

		if (dto.getModel() == null || dto.getModel().length() < 4) {
			System.out.println("Invalid SewingMachine Model");
			flag = false;
		}

		if (dto.getPrice() == 0 || dto.getPrice() < 5000) {
			System.out.println("Invalid SewingMachine Price");
			flag = false;
		}

		if (dto.getColor() == null || dto.getColor().length() < 4) {
			System.out.println("Invalid SewingMachine color");
			flag = false;
		}
		if (flag) {
			impl.saveSewingMachine(dto);
			System.out.println("Added Details Successfully");
		}

	}

	@Override
	public void validateSewingMachineDetails() {

		impl.fetchSewingMachineDetails();
		System.out.println("Fetched Details From DB");
	}

}

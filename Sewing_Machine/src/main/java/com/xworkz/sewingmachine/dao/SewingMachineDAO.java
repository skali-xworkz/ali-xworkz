package com.xworkz.sewingmachine.dao;

import com.xworkz.sewingmachine.dto.SewingMachineDTO;

public interface SewingMachineDAO {
	
	public void saveSewingMachine(SewingMachineDTO dto);
	
	public void fetchSewingMachineDetails();

}
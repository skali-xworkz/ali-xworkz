package com.xworkz.vacccine.dao;

import com.xworkz.vacccine.entity.VaccineEntity;

public interface VaccineDAO {
	public boolean saveVaccineDTO(VaccineEntity vaccineEntity);
	VaccineEntity getEmailByEntity(String email,String password);
}

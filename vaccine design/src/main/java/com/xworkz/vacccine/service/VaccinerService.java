package com.xworkz.vacccine.service;

import org.springframework.ui.Model;

import com.xworkz.vacccine.dto.VaccineDTO;

public interface VaccinerService {
	public boolean registerVacciner(VaccineDTO dto);

	public boolean loginEmailAndPasswordValidate(String email,String Password);
	public boolean loginService(String email , String Password , Model model);

}

package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImpl;

public class InstagramTester {

	public static void main(String[] args) {
		
		InstagramDTO dto = new InstagramDTO(400,5.5, 10, 500, true);
		
		InstagramService serviceImpl = new InstagramServiceImpl();
		serviceImpl.validateInstagramDTO(dto);
		
		
		serviceImpl.validateInstagramDetails();
	}

}

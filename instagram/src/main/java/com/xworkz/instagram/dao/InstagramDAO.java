package com.xworkz.instagram.dao;

import com.xworkz.instagram.dto.InstagramDTO;

public interface InstagramDAO {

	
	public void saveInstagramDTO(InstagramDTO dto);
	
	public void fetchInstagramDetails();
	
}

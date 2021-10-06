package com.xworkz.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.amazon.dao.AmazonDAO;
import com.xworkz.amazon.dto.AmazonDTO;
import com.xworkz.amazon.entity.AmazonEntity;

@Service
public class AmazonServiceImpl implements AmazonService {
	
	@Autowired
	private AmazonDAO amazonDAO;
	
	boolean isValidData=true;
	
	
	public AmazonServiceImpl() {
		System.out.println(getClass().getSimpleName() + "Validation is started");
	}

	public boolean validateRegisterAmazon(AmazonDTO amazondto) {
		AmazonEntity amazonEntity = new AmazonEntity();
		amazonEntity.setName(amazondto.getName());
		amazonEntity.setPassword(amazondto.getPassword());
		System.out.println("checking validating amazon deatils");
		if(amazondto.getName()==null ||amazondto.getName().length()<4) {
			isValidData=false;
			System.out.println("please provide more than 4 characters");
		}
		else if(amazondto.getPassword()==null||amazondto.getPassword().length()<5) {
			isValidData=false;
			System.out.println("please provide more than 5 charcters");
		}
		
		if(isValidData) {
			amazonDAO.saveRegisterAmazon(amazonEntity);
		}
		
		return isValidData;
	}

}

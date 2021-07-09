package com.xworkz.mobile.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDAO daoImpl;
	boolean isValidData = true;

	public MobileServiceImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	@Override
	public boolean validateMobileDTO(MobileDTO dto) {

		MobileEntity entity = new MobileEntity();
//		entity.setName(dto.getName());
//		entity.setBrand(dto.getBrand());
//		entity.setRam(dto.getRam());
//		entity.setPrice(dto.getPrice());
		BeanUtils.copyProperties(dto, entity);

		System.out.println("checking validate mobile details");
		if (dto.getName() == null || dto.getName().length() < 4) {
			isValidData = false;
			System.out.println("please provide valid Mobilename");
		} else if (dto.getBrand() == null || dto.getBrand().length() < 5) {
			isValidData = false;
			System.out.println("please provide valid Mobile_Brand_name");
		} else if (dto.getRam() == null || dto.getRam().length() < 2) {
			isValidData = false;
			System.out.println("please provide valid Mobile_RAM");
		} else if (dto.getPrice() == null || dto.getPrice().length() < 5) {
			isValidData = false;
			System.out.println("please provide valid Mobile_Price");
		}
		if (isValidData) {
			daoImpl.saveMobileDTO(entity);
		}
		return isValidData;
	}

}
//		boolean result = daoImpl.saveMobileDTO(entity);
//		if (result) {
//			System.out.println("data saved");
//			return true;
//		} else {
//			System.out.println("data not saved");
//			return false;
//		}

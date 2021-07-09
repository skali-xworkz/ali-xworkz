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

		boolean result = daoImpl.saveMobileDTO(entity);
		if (result) {
			System.out.println("data saved");
			return true;
		} else {
			System.out.println("data not saved");
			return false;
		}
	}

}

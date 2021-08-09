package com.xworkz.enroll.service;

import org.springframework.beans.BeanUtils;

import com.xworkz.enroll.dao.EnrollDAO;
import com.xworkz.enroll.dto.EnrollDTO;
import com.xworkz.enroll.entity.EnrollEntity;

public class EnrollServiceImpl implements EnrollService  {

	private EnrollDAO enrollDAO;
	
	public EnrollServiceImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}
	@Override
	public boolean enrollStudent(EnrollDTO dto) {
		System.out.println("invoked enrollStudent ");
		EnrollEntity enrollEntity=new EnrollEntity();
		BeanUtils.copyProperties(dto, enrollEntity);
		boolean result=this.enrollDAO.saveEnrollDTO(enrollEntity);
		if(result) {
			System.out.println("send a mail");
		}
		else {
			System.out.println("somethig went wrong try again");
		}
		return false;
	}

}
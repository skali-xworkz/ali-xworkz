package com.xworkz.enroll.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.enroll.dao.EnrollDAO;
import com.xworkz.enroll.dto.EnrollDTO;
import com.xworkz.enroll.entity.EnrollEntity;

@Service
public class EnrollServiceImpl implements EnrollService  {

	@Autowired
	private EnrollDAO enrollDAO;
	 
	public EnrollServiceImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}
	public boolean enrollStudent(EnrollDTO dto) {
		System.out.println("invoked enrollStudent ");
		EnrollEntity enrollEntity=new EnrollEntity();
		BeanUtils.copyProperties(dto, enrollEntity);
		boolean result=this.enrollDAO.saveEnrollDTO(enrollEntity);
		if(result) {
			System.out.println("send a mail");
			return true;
		}
		else {
			System.out.println("somethig went wrong try again");
		}
		return false;
	}

}
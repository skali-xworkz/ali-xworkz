package com.xworkz.enroll.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.enroll.dao.EnrollDAO;
import com.xworkz.enroll.dto.EnrollDTO;
import com.xworkz.enroll.entity.EnrollEntity;
import com.xworkz.enroll.util.RandomPasswordGenerator;

@Service
public class EnrollServiceImpl implements EnrollService {

	@Autowired
	private EnrollDAO enrollDAO;

	@Autowired
	private JavaMailSender mailSender;

	public EnrollServiceImpl() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	public boolean enrollStudent(EnrollDTO dto) {
		System.out.println("invoked enrollStudent ");
		EnrollEntity enrollEntity = new EnrollEntity();
		String randomPassword = RandomPasswordGenerator.generateRandomPassword(6);
		enrollEntity.setPassword(randomPassword);
		BeanUtils.copyProperties(dto, enrollEntity);
		boolean result = this.enrollDAO.saveEnrollDTO(enrollEntity);
		if (result) {
			System.out.println("send a mail");
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(dto.getEmail());
			mailMessage.setSubject(" Account login Details");
			mailMessage.setText("Welcome to ENROLL_Application " + "Form    " + dto.getEnrollName() + "your password   "
					+ enrollEntity.getPassword());
			this.mailSender.send(mailMessage);
			return true;
		} else {
			System.out.println("somethig went wrong try again");
		}
		return false;
	}
}
package com.xworkz.vacccine.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailDispatcher {
	@Autowired
	private JavaMailSender mailSender;

	public boolean SendOTP(String mailID, String subject, String text) {
		System.out.println("send a mail");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(mailID);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		this.mailSender.send(mailMessage);
		return true;
	}
}
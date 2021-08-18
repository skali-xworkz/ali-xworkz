package com.xworkz.vacccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vacccine.util.MailDispatcher;
import com.xworkz.vacccine.util.OtpGenerator;

@Controller
public class OtpController {

	@Autowired
	private MailDispatcher mailDispatcher;

	public OtpController() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	@RequestMapping(value = "/startotp.do")
	public String getOtp(@RequestParam String email, Model model) {
		System.out.println("invoked getOTP");
		int otpNumber = OtpGenerator.randomNumberGenerator(1000, 9999);
		this.mailDispatcher.SendOTP(email, "OTP_Message", "Hi Your OTP for Vaccination is  " + otpNumber);
		model.addAttribute("OtpSuccessMessage", "Your Otp sent to mail id");
		System.out.println("OTP is generated");
		return "home";
	}
}
package com.xworkz.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.amazon.dto.AmazonDTO;
import com.xworkz.amazon.service.AmazonService;

@Controller
public class AmazonController {

	@Autowired
	private AmazonService amazonService;

	public AmazonController() {
		System.out.println(getClass().getSimpleName() + "Controller is created");
	}

	@RequestMapping(value = "/register.do")
	public String onSubmit(@ModelAttribute AmazonDTO dto, Model model) {
		System.out.println("invoking onSubmit method");
		System.out.println(dto);

		boolean result = amazonService.validateRegisterAmazon(dto);
		if (result) {
			model.addAttribute("amazonmessage", "application suceesfully done");
			return "success";
		} else {
			model.addAttribute("amazonmessage", "application failed try again later!!!");
			return "fail";
		}

	}
}

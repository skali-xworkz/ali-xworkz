package com.xworkz.mobile.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mobile.dto.MobileDTO;

@Controller
public class MobileController {
	public MobileController() {
		System.out.println("MobileController object is created");
	}
	@RequestMapping(value = "/mobile.do", method = RequestMethod.POST)
	public String submit(@ModelAttribute MobileDTO mobiledto, Model model) {
		System.out.println("invoked submit()");
		System.out.println(mobiledto);
		model.addAttribute("display", "Thank you for ordering my Mobile_Showroom");
		return "index.jsp";

	}

}

package com.xworkz.enroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.enroll.dto.EnrollDTO;
import com.xworkz.enroll.service.EnrollService;

@Controller
public class EnrollController {
	@Autowired
	private EnrollService enrollService;

	public EnrollController() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	@RequestMapping(value = "/onenroll.do")
	public String onEnroll(@ModelAttribute EnrollDTO enrollDTO, Model model) {

		System.out.println("invoked onEnroll");
		System.out.println(enrollDTO);

		boolean outcome = this.enrollService.enrollStudent(enrollDTO);
		if (outcome) {
			model.addAttribute("enrollmessage", "congrats enroll message succefully done");
			return "EnrollSuccess";
		} else {
			model.addAttribute("enrollmessage", " failed to enroll try again later");
			return "EnrollSuccess";
		}
	}
}
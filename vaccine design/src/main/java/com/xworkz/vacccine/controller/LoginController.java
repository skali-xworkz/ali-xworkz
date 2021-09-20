package com.xworkz.vacccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vacccine.dto.VaccineDTO;
import com.xworkz.vacccine.service.VaccinerService;

@Controller
public class LoginController {

	@Autowired
	private VaccinerService vaccinerService;

	public LoginController() {
		System.out.println(getClass().getSimpleName() + "object is created");
	}

	@RequestMapping(value = "/login.do")
	public String onLogin(@RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("invoked on login method");
		//boolean outcome = this.vaccinerService.loginEmailAndPasswordValidate(email, password);
	//	if (outcome) {
			boolean loginSuccessResult = this.vaccinerService.loginService(email, password, model);
			if (loginSuccessResult) {
				model.addAttribute("loginmessage", "your account login succesfullly done");
				return "success";
			} else {
				model.addAttribute("loginmessage", " Login Failed your user & password wrong try again later");
				return "fail";
			}

		//}
		//return null;

	}

}
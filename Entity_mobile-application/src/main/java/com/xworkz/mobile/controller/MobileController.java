package com.xworkz.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	private MobileService mobileService;
	public MobileController() {
		System.out.println("MobileController object is created");
	}
	@RequestMapping(value ="/mobile.do", method = RequestMethod.POST)
	public String submit(@ModelAttribute MobileDTO mobiledto, Model model) {
		System.out.println("invoked submit()");
		System.out.println(mobiledto);
		
		  boolean res=mobileService.validateMobileDTO(mobiledto);
		  if(res)
		  {
		  model.addAttribute("display","Thank for submitting the form,DATA is saved");
		  }
		  else
		  {
		  model.addAttribute("display","something went wrong,Data is not saved");
		    
		  }
		  return"mobileresponse";
		 
		/*
		 * mobileService.validateMobileDTO(mobiledto); model.addAttribute("display",
		 * "Thank for submitting the form,mobile details are:"+mobiledto.getName()+"\t"+
		 * mobiledto.getBrand()+"\t"+mobiledto.getRam()+"\t"+mobiledto.getPrice());
		 * return"mobileresponse"; return "index.jsp";
		 */
	}

}

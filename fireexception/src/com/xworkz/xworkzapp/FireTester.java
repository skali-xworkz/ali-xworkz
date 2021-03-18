package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.FireDTO;
import com.xworkz.xworkzapp.service.FireService;
import com.xworkz.xworkzapp.service.FireServiceImp;

public class FireTester {
public static void main(String[] args) {
	System.out.println("programs Start");
	FireDTO fd=new FireDTO("Rajajinagarstation","FIR123","Rajaji",1,5);		
			FireService fs=new FireServiceImp();
			fs.validId(fd);
			//fd.getId();
			System.out.println("programs End");
}
}

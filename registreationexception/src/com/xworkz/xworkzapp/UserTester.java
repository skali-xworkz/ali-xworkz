package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.UserDTO;
import com.xworkz.xworkzapp.service.UserService;
import com.xworkz.xworkzapp.service.UserServiceImp;

public class UserTester {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("start program");
		UserDTO ud = new UserDTO("ramesh", "ramesh@gmail.com", 876983193, 12345678);
		UserDTO ud1 = new UserDTO("mahesh", "ramesh@gmail.com", 876983163, 87654321);
		UserDTO ud2 = new UserDTO("jamesh", "ramesh@gmail.com", 876983143, 23416785);
		UserDTO ud3 = new UserDTO("mallesh", "ramesh@gmail.com", 876983223, 32145678);
		UserDTO ud4 = new UserDTO("kalesh", "ramesh@gmail.com", 876983123, 42315678);
		UserDTO ud5 = new UserDTO("talesh", "ramesh@gmail.com", 876983023, 72345618);
		UserService us = new UserServiceImp();
		us.validUser(ud);
		us.validUser(ud1);
		us.validUser(ud2);
		us.validUser(ud3);
		us.validUser(ud4);
		us.validUser(ud5);
		System.out.println("EOD of program");
	}

}

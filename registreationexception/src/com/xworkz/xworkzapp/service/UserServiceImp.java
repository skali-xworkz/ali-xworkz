package com.xworkz.xworkzapp.service;


import com.xworkz.xworkzapp.customized.InvalidNameException;
import com.xworkz.xworkzapp.customized.InvalidAdharException;
import com.xworkz.xworkzapp.customized.InvalidEmailException;
import com.xworkz.xworkzapp.customized.InvalidPhoneNumException;
import com.xworkz.xworkzapp.dao.UserDaoImp;
import com.xworkz.xworkzapp.dto.UserDTO;

public class UserServiceImp implements UserService {
	UserDaoImp udi = new UserDaoImp();
	boolean isValidData=true;
	@Override
	public void validUser(UserDTO dto) throws RuntimeException {
		// TODO Auto-generated method stub	
		if (!dto.getEmail().contains("@")) {
			isValidData=false;
		throw new InvalidEmailException("invalid Email exception");
		}
		if (dto.getName()==null || dto.getName().length()<4) {
			isValidData=false;
			throw new InvalidNameException("Invalid Name_exception");
		}
		if (dto.getPhoneNo() <= 10){
			isValidData=false;
			throw new InvalidPhoneNumException("Invalid Phone_exception");
		}
		if(dto.getAdharId()<=12){
			isValidData=false;
		throw new InvalidAdharException("Invalid Adhar_Exception");
		}
	if(isValidData){
		udi.addUserDetails(dto);
	}
	}
}

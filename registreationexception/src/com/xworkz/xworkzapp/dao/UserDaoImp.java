package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.UserDTO;

public class UserDaoImp implements UserDao{

	UserDTO register[]=new UserDTO[3];
	int index=0;
	
	public UserDaoImp() {
		// TODO Auto-generated constructor stub
	System.out.println("user details daoImp object is creared");
	}
	
	@Override
	public void addUserDetails(UserDTO dto) throws RuntimeException{
		// TODO Auto-generated method stub
		if(index<3){
			register[index]=dto;
			System.out.println("user details added suceesfully");
			index++;
		}else{
			throw new RuntimeException("out_of_Bond");
		}
	}

}

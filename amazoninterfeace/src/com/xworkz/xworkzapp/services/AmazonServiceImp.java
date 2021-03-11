package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.dao.AmazonDaoImp;
import com.xworkz.xworkzapp.dto.AmazonDto;

public class AmazonServiceImp implements AmazonService {
	private AmazonDaoImp amz = new AmazonDaoImp();

	@Override
	public void checkLogin(String user, String pwd) {
		if (user != null && user.contains("@") && user.contains(".com") && pwd != null && pwd.length() > 6)
			System.out.println("");
		amz.login(user, pwd);
	}

	@Override
	public void displayMovies() {
		// TODO Auto-generated method stub
		amz.displayAll();
	}

	@Override
	public void displaySubscriber(String su) {
		// TODO Auto-generated method stub
		amz.viewSubscriber(su);
	}

	@Override
	public void checkadd(AmazonDto  name) {
		if (name != null) {
			amz.addmovies(name);
		}
	}

}

package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.AmazonDto;

public class AmazonDaoImp implements AmazonDao {
	AmazonDto amazonDetails[] = new AmazonDto[2];
	int index = 0;

	String sub[] = { "appu", "darshan", "sathosh", "teerth", "ali" };

	@Override
	public void login(String user, String pass) {
		// TODO Auto-generated method stub
		if (user.equals(AmazonDao.userName) && pass.equals(AmazonDao.password)) {

			System.out.println("welcome to amazon prime video");
			AmazonDao.super.displayDate();
			AmazonDao.displayCompany();
		} else {
			System.out.println("invalid credentails");
		}
	}

	@Override
	public void addmovies(AmazonDto dto) {
		// TODO Auto-generated method stub
		amazonDetails[index] = dto;
		index++;
		System.out.println("Movie added successfully");
	}

	@Override
	public void viewSubscriber(String sub1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < amazonDetails.length; i++) {
			if (amazonDetails[i] != null) {
				System.out.println("movieName:"+amazonDetails[i].getMovieName());
				System.out.println("actor name:"+amazonDetails[i].getActor());
				System.out.println("moviesize:"+amazonDetails[i].getSize());
				System.out.println("movieRating:"+amazonDetails[i].getRating());
			}
		}
	}

}

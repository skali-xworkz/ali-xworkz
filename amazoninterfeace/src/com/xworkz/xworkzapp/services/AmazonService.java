package com.xworkz.xworkzapp.services;

import com.xworkz.xworkzapp.dto.AmazonDto;

public interface AmazonService {
public void checkLogin(String user,String pwd);
public void checkadd(AmazonDto name);
public void displayMovies();
public void displaySubscriber(String su);
}

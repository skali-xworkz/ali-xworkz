package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.AmazonDto;
import java.util.Date;

public interface AmazonDao {
	static final String userName="admin@amzon.com";
	static final String password="amzon@123";
public void login(String userName,String password);
public void addmovies(AmazonDto dto);
public void displayAll();
public void viewSubscriber(String sub);
default void test(){
	System.out.println("test");
}
default void displayDate(){
	System.out.println(new Date());
}
public static void displayCompany(){
	System.out.println("amazon");
}


}

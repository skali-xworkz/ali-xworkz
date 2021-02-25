package com.xworkz.xworkzapp.PVR.stati;

public class TheatreStart {
	static private  String name;
	static private String address;
	static private int noOfSeats;
	//block
	static
	{
		name="Navarang";
		address="tumkur road";
		noOfSeats=100;
		//name=name;
		//address=address;
		//noOfSeats=noOfSeats;
		System.out.println("STATIC Block is executed");
		
	}
	public static void relasingMovies()
	{
		System.out.println("relasing Master");
	}
	
	public static void main(String[] args) {
//		TheatreStartStart TheatreStart=new TheatreStartStart();
		//we should not create object in static 
		TheatreStart.relasingMovies();
		System.out.println(TheatreStart.name+" "+TheatreStart.address+" "+TheatreStart.noOfSeats);
	}
}
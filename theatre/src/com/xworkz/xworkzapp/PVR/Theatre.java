package com.xworkz.xworkzapp.PVR;

public class Theatre {
	private String name;
	private String address;
	private int noOfSeats;
	private int getAddress;
	
	public Theatre() {
		// TODO Auto-generated constructor stub
		System.out.println("Theatre object is created");
	}
	//block
	{
		String name="Navarang";
		String address="tumkur road";
		int noOfSeats=100;
		this.name=name;
		this.address=address;
		this.noOfSeats=noOfSeats;
		System.out.println("INIT Block is executed");
		
	}
	public static void relasingMovies()
	{
		System.out.println("relasing Master");
	}
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public static void main(String[] args) {
		Theatre theatre=new Theatre();
		Theatre.relasingMovies();
		System.out.println(theatre.getName()+" "+theatre.getAddress()+" "+theatre.getNoOfSeats());
	}
}

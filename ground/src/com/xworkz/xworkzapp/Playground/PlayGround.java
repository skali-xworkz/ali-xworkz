package com.xworkz.xworkzapp.Playground;

public class PlayGround {
	public String area;
	public String typeOfGames;
	public PlayGround() {
		this("Nagarbhavi");
		// TODO Auto-generated constructor stub
		System.out.println("playground Object with zero parameter is created");
	}
	public PlayGround(String area) {
		this(area,"cricket&Lagori");
		// TODO Auto-generated constructor stub
		System.out.println("playground object with one parameter is created");
	}
	public PlayGround(String area,String typeOfGames) {
		// TODO Auto-generated constructor stub
		this.area=area;
		this.typeOfGames=typeOfGames;
		System.out.println("playground object with two parameter is created");
	}
	public PlayGround PlayGames(){
		
		return this;
	}
}
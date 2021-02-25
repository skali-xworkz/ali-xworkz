package com.xworkz.xworkzapp.Playground;

public class GroundTester {
	public static void main(String[] args) {
		PlayGround gd=new PlayGround();
		System.out.println(gd.area+" "+gd.typeOfGames);
		//System.out.println(gd+"\nobject releated references number");
		PlayGround gd1= gd.PlayGames();
		System.out.println(gd1);
	}

}
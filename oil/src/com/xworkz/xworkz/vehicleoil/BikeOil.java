package com.xworkz.xworkz.vehicleoil;
public class BikeOil {
	static private  String name;
	static private String address;
	static private int price;
	//block
	static
	{
		name="castrol activ";
		address="Peenya II Phase";
		price=350;
		System.out.println("STATIC Block is executed");
		
	}
	public static void AdvantagesBikeOil()
	{
		System.out.println("****BIKE_OIL_INFO****");
		System.out.println("Provide excellent corrosion protection,\neven when the engine is off.");
		System.out.println("***************");	
	}
	
	public static void main(String[] args) {
		//we should not create object in static 
		BikeOil.AdvantagesBikeOil();
		System.out.println(BikeOil.name+" "+BikeOil.address+" "+BikeOil.price);
	}
}

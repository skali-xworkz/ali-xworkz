package com.xworkz.xworkz.foodoil;
public class Food {
	private String name;
	private String address;
	private int price;
	
	public Food() {
		// TODO Auto-generated constructor stub
		System.out.println("Food object is created");
	}
	//block
	{
		String name="Freedom_Refined_Sunflower_Oil";
		String address="Mysore";
		int price=150;
		this.name=name;
		this.address=address;
		this.price=price;
		System.out.println("INIT Block is executed");
		
	}
	public static void advantagesOil()
	{
		System.out.println("****FOOD_OIL_INFO****");
		System.out.println("Freedom Refined Sunflower Oil is clear,\nlight and low absorbing.It is wealthy Vitamins D, A & E which makes it superior for your child health.\nIt is a blend of monounsaturated and polyunsaturated fats with low saturated fat levels.\nNUTRITIONAL FACTS.\n");
		System.out.println("********");
	}
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public static void main(String[] args) {
		Food Food=new Food();
		Food.advantagesOil();
		System.out.println(Food.getName()+" "+Food.getAddress()+" "+Food.getPrice());
	}
}

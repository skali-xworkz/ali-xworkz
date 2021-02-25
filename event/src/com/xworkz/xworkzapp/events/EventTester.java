package com.xworkz.xworkzapp.events;
public class EventTester {
	public static void main(String[] args) {
		Event et=new Event();
		System.out.println(et.name+" "+et.address);
		Event et1=et.EnjoyEvent();
		System.out.println(et1);
	}
}
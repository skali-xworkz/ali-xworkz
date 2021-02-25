package com.xworkz.xworkzapp.events;
public class Event {
	public String name;
	public String address;
	public Event() {
		this("birthday");
		// TODO Auto-generated constructor stub
		System.out.println("birthday Object with zero parameter is created");
	}
	public Event(String name) {
		this(name,"Bangalore");
		// TODO Auto-generated constructor stub
		System.out.println("Event object with one parameter is created");
	}
	public Event(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		System.out.println("Event object with two parameter is created");
	}
	public Event EnjoyEvent(){
		return this;
	}
}
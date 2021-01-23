package com.xworkz.xworkzapp.dto;

public class TrekkingDTO {
	private String places;
	private int members;
	private float cost;
	public TrekkingDTO(String places,int members,float cost)
	{
		this.places=places;
		this.members=members;
		this.cost=cost;
	}
	/*public void setCost(float cost) {
		this.cost = cost;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public void setPlaces(String places) {
		this.places = places; 
	} */
	public String getPlaces() {
		return places;
	}
	public int getMembers() {
		return members;
	}
	public float getCost() {
		return cost;
	}
	
}

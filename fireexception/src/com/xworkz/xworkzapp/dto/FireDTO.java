package com.xworkz.xworkzapp.dto;

public class FireDTO {
private String fireName;
private String id;
private String location;
private int noOfVehicles;
private int noOfWorkers;
public FireDTO(String fireName, String id, String location, int noOfVehicles, int noOfWorkers) {
	super();
	this.fireName = fireName;
	this.id = id;
	this.location = location;
	this.noOfVehicles = noOfVehicles;
	this.noOfWorkers = noOfWorkers;
}
public String getFireName() {
	return fireName;
}
public void setFireName(String fireName) {
	this.fireName = fireName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfVehicles() {
	return noOfVehicles;
}
public void setNoOfVehicles(int noOfVehicles) {
	this.noOfVehicles = noOfVehicles;
}
public int getNoOfWorkers() {
	return noOfWorkers;
}
public void setNoOfWorkers(int noOfWorkers) {
	this.noOfWorkers = noOfWorkers;
}
}

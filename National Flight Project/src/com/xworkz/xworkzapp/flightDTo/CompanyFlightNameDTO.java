package com.xworkz.xworkzapp.flightDTo;
import com.xworkz.xworkzapp.CompanyNames;
public class CompanyFlightNameDTO {
private int flightNumber;
private CompanyNames companyName;
private String startingPoint;
private String destination;
private int totalSeats;
private boolean domestic;
private double businessClassPrice;
private double economicClassPrice;
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public CompanyNames getCompanyName() {
	return companyName;
}
public void setCompanyName(CompanyNames companyName) {
	this.companyName = companyName;
}
public String getStartingPoint() {
	return startingPoint;
}
public void setStartingPoint(String startingPoint) {
	this.startingPoint = startingPoint;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public boolean isDomestic() {
	return domestic;
}
public void setDomestic(boolean domestic) {
	this.domestic = domestic;
}
public double getBusinessClassPrice() {
	return businessClassPrice;
}
public void setBusinessClassPrice(double businessClassPrice) {
	this.businessClassPrice = businessClassPrice;
}
public double getEconomicClassPrice() {
	return economicClassPrice;
}
public void setEconomicClassPrice(double economicClassPrice) {
	this.economicClassPrice = economicClassPrice;
}
}

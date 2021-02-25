package com.xworkz.xworkzapp.BusDTO;

import com.xworkz.xworkzapp.BusCompanyNames;

public class CompanyBusNameDTO {
	private int BusNumber;
	private BusCompanyNames BusCompanyName;
	private String source;
	private String destination;
	private int totalSeats;
	private boolean busType;
	private double busTicket;
	public int getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(int busNumber) {
		this.BusNumber = busNumber;
	}
	public BusCompanyNames getBusCompanyName() {
		return BusCompanyName;
	}
	public void setBusCompanyName(BusCompanyNames busCompanyName) {
		this.BusCompanyName = busCompanyName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public boolean isBusType() {
		return busType;
	}
	public void setBusType(boolean busType) {
		this.busType = busType;
	}
	public double getBusTicket() {
		return busTicket;
	}
	public void setBusTicket(double busTicket) {
		this.busTicket = busTicket;
	}
	
}

package com.xworkz.market;

public class SuperMarket {
private String name;
private int noOfCounters;
private Address address;
private double gst;
private Worker worker;
public SuperMarket(String name, int noOfCounters, Address address, double gst, Worker worker) {
	super();
	this.name = name;
	this.noOfCounters = noOfCounters;
	this.address = address;
	this.gst = gst;
	this.worker = worker;
	System.out.println(this.getClass().getSimpleName()+"object created");

}
@Override
public String toString() {
	return "\nSuperMarket [" + (name != null ? "name=" + name + ", " : "") + "noOfCounters=" + noOfCounters + ", \n"
			+ (address != null ? "address=" + address + ", " : "") + "gst=" + gst + ", "
			+ (worker != null ? "\nworker=" + worker : "") + "]";
}

}

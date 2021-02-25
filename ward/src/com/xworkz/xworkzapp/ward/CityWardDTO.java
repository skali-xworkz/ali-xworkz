package com.xworkz.xworkzapp.ward;

import com.xworkz.xworkzapp.WardName;
public class CityWardDTO {
	private int wardNo;
	private WardName wardName;
	private String corporationName;
	private long population;
	private String area;
	public int getWardNo() {
		return wardNo;
	}
	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}
	public String getCorporationName() {
		return corporationName;
	}
	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}

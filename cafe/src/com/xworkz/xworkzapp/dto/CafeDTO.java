package com.xworkz.xworkzapp.dto;

public class CafeDTO {
	private String name;
	private String address;
	public CafeDTO(String nm,String ad)
		{
			name=nm;
			address=ad;
		}
	public void setName(String xy)
	{
		name=xy;
		
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String xz)
	{
		address=xz;
	}
	public String getAddress()
	{
		return address;
	}
}

package com.xworkz.xworkzapp.dto;

public class JokerDTO {
	private String name;
	private String address;
	private long mobileno;
	public JokerDTO(String nm,String ad,long mb){
		name=nm;
		address=ad;
		mobileno=mb;
	}
	public String getName()
	{
		return name;
		
	}
	public String getAddress()
	{
		return address;
		
	}
	public long getmobileno()
	{
		return mobileno;
	}
	public void setName(String nm)
	{
		name=nm;
	}
	public void setAddress(String ad)
	{
		address=ad;
	}
	public void setmobile(long mb)
	{
		mobileno=mb;
	}
}


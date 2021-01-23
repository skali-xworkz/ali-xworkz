package com.xworkz.xworkzapp.dto;

public class BankDTO {
	private String name;
	private String address;
	private long contactNo;
	public BankDTO(String nm,String ad,long cn)
	{
		name=nm;
		address=ad;
		contactNo=cn;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public long getcontactNo()
	{
		return contactNo;
	}
	public void setName(String nm)
	{
		name=nm;
	}
	public void setAddress(String ad)
	{
		address=ad;
	}
	public void setContactNo(int cn)
	{
		contactNo=cn;
	}	
}

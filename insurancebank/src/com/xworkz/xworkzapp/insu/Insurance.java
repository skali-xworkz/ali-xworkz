package com.xworkz.xworkzapp.insu;

public class Insurance {

	 int insuranceId;
	 String type;
	public void security(){
		System.out.println("providing security family");
	}
	
	@Override
	public  int hashCode(){
		return this.insuranceId;
	}
	@Override
	public String toString(){
		return  "insurance - [insuranceId="+this.insuranceId+",type="+this.type+" ]";		
	}
	@Override
	public boolean equals(Object obj){
		boolean check=false;
		if(obj instanceof Insurance){
		//refer
			System.out.println("inside instanceof");	
		if(this.hashCode()==obj.hashCode())
		{
			return true;
		}
		}
		return check;
	}
}
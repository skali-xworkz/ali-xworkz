package com.xworkz.xworkzapp.insu;

public class InsuranceTester {

	public static void main(String[] args) {
		Insurance insurance=new Insurance();
		insurance.insuranceId=345;
		insurance.type="Health-Insurance";
		System.out.println(insurance.insuranceId+""+insurance.type);
		Insurance insurance1=new Insurance();
		insurance1.insuranceId=341;
		insurance1.type="Term-Insurance";
		System.out.println(insurance1.insuranceId+""+insurance1.type);
		System.out.println(insurance.hashCode());
		System.out.println(insurance1.hashCode());
		System.out.println(insurance);
		System.out.println(insurance1);
		System.out.println(insurance.equals(insurance1));
	}
}

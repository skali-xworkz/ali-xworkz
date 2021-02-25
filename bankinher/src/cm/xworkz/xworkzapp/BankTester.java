package cm.xworkz.xworkzapp;

import cm.xworkz.xworkzapp.bank.Axis;
import cm.xworkz.xworkzapp.bank.Bank;
import cm.xworkz.xworkzapp.bank.Sbi;

public class BankTester {
	public static void main(String[] args) {
		Bank a=new Axis();
		a.BankInterest();
		//a.BankInterest()
		Bank b= new Sbi();
		b.BankInterest();
	}
	//bank b;
	//b=new sbi();

}

package com.xworkz.xworkzapp.BusDTO;

public class BusBooking{
	public CompanyBusNameDTO[] BusCompany;
	int index;

	public BusBooking(int size) {
		BusCompany = new CompanyBusNameDTO[size];
	}

	public void addCustomer(CompanyBusNameDTO companyBusNameDTO) {
		if (companyBusNameDTO.getBusNumber()!=0
				&& companyBusNameDTO.getBusCompanyName()!=null 
				&& companyBusNameDTO.getBusTicket() >= 1000.0
				&& companyBusNameDTO.getSource()!=null 
				&& companyBusNameDTO.getTotalSeats()!=0
				&& companyBusNameDTO.getDestination()!=null) {
			BusCompany[index++]=companyBusNameDTO;
		}
	}
public void getBusInformation() {
		for (int i = 0; i<BusCompany.length; i++) {
System.out.println(BusCompany[i].getBusNumber()
		+""+BusCompany[i].getBusCompanyName()
		+""+BusCompany[i].getSource()
		+""+BusCompany[i].getDestination()
		+""+BusCompany[i].getBusTicket()
		+""+BusCompany[i].getTotalSeats());
		}
}
}

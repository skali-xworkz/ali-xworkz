package com.xworkz.xworkzapp.flightDTo;
//declaring and initilizing the array
	// public int[] arr = new int[2];
public class FlightBooking {
	public CompanyFlightNameDTO[] company;
	int index;
	public FlightBooking(int size){
	company = new CompanyFlightNameDTO[size];
	}

	public void addPassenger(CompanyFlightNameDTO companyFlightNameDTO) {
		if (companyFlightNameDTO.getFlightNumber() != 0 && companyFlightNameDTO.getCompanyName() != null
				&& companyFlightNameDTO.getBusinessClassPrice() >= 1000.0
				&& companyFlightNameDTO.getStartingPoint() != null
				&& companyFlightNameDTO.getEconomicClassPrice() != 0.0) {
			company[index++] = companyFlightNameDTO;
		}
	}

	public void getFlightInfo() {
		for (int i = 0; i < company.length; i++) {
			System.out.println(company[i].getFlightNumber() 
					+ "" + company[i].getCompanyName() 
					+ ""+ company[i].getStartingPoint() 
					+ "" + company[i].getDestination() 
					+ "" + company[i].getTotalSeats()
					+ "" + company[i].getBusinessClassPrice() 
					+ "" + company[i].getEconomicClassPrice());
			;
		}
	}

	public void getFlightDetails(String StartingPoint) {
		for (int i = 0; i < company.length; i++) {
			if (company[i].getStartingPoint().equals(StartingPoint)) {
				System.out.println(company[i].getFlightNumber() + "" + company[i].getCompanyName() + ""
						+ company[i].getStartingPoint() + "" + company[i].getDestination() + ""
						+ company[i].getTotalSeats() + "" + company[i].getBusinessClassPrice() + ""
						+ company[i].getEconomicClassPrice());;
			} else
				System.out.println("starting point not found");
		}
	}
}

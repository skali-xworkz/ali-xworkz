package com.xworkz.xworkzapp.ward;

import com.xworkz.xworkzapp.WardName;

public class City {
	public CityWardDTO[] cityWardDTO;
	private int index;

	public City(int size) {
		cityWardDTO = new CityWardDTO[size];
	}

	public void addCityWards(CityWardDTO cityWardDTO) {
		this.cityWardDTO[index++] = cityWardDTO;
	}

	public void getCityWardDetails() {

		for (int i = 0; i < cityWardDTO.length; i++) {
			if (cityWardDTO[i] != null) {
				System.out.println(cityWardDTO[i].getWardNo() + "" + cityWardDTO[i].getWardName() + ""
						+ cityWardDTO[i].getPopulation() + "" + cityWardDTO[i].getCorporationName() + ""
						+ cityWardDTO[i].getArea());
			} else {
				System.out.println("city is null ");
			}
		}
	}

	public void update(int wardNo, long population) {
		if (population > 0) {
			for (int i = 0; i < cityWardDTO.length; i++) {
				if (cityWardDTO[i].getWardNo() == wardNo) {
					cityWardDTO[i].setPopulation(population);
				} else {
					System.out.println("city ward data not found");
				}
			}
		}
	}

	public void delete(int wardNo) {
		for (int i = 0; i < cityWardDTO.length; i++) {
			if (cityWardDTO[i].getWardNo() == wardNo) {
				cityWardDTO[i] = null;
				System.out.println("deleted succesfully");
				break;

			} else {
				System.out.println("no ward found");
			}
		}
	}

	public String getcorporationName(WardName wardName) {
		for (CityWardDTO cityWardDTO : cityWardDTO) {
			if (cityWardDTO.getWardName().equals(wardName)) {
				return cityWardDTO.getCorporationName();
			}
		}
		return null;
	}

}
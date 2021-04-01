package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.PlaceDTO;

public class PlaceSearchServiceImp implements PlaceSearch {

	@Override
	public boolean nameAndLocation(PlaceDTO dto) {
		if (dto.getLocation().equals("Bangalore")){
			return true;
		} else
			return false;
	}

	@Override
	public boolean nameAndLocationAndPincodeSearch(PlaceDTO dto) {
		// TODO Auto-generated method stub
	if(dto.getPincode()==560025){
		return true;
	}else
		return false;
	}
	
}
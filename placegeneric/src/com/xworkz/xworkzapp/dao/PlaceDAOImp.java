package com.xworkz.xworkzapp.dao;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.xworkz.xworkzapp.dto.PlaceDTO;
import com.xworkz.xworkzapp.service.PlaceSearch;

public class PlaceDAOImp implements PlaceDAO{

	List<PlaceDTO> addPlace = new ArrayList<PlaceDTO>();
	
	public PlaceDAOImp() {
		// TODO Auto-generated constructor stub
		PlaceDTO pd=new PlaceDTO("Bangalore Palace", "Bangalore", 560012, true);
		PlaceDTO pd1=new PlaceDTO("Nandi Hills", "Chikkaballapur", 560012, true);
		PlaceDTO pd2=new PlaceDTO("ISKCON Temple", "Mysore", 560014, false);
		PlaceDTO pd3=new PlaceDTO("Tipu Sultan’s Palace","Bangalore", 560025, true);
		PlaceDTO pd4=new PlaceDTO("Lalbagh Botanical Garden", " Bangalore", 560025, true);
		
		addPlace.add(pd);
		addPlace.add(pd1);
		addPlace.add(pd2);
		addPlace.add(pd3);
		addPlace.add(pd4);
	}
	
	@Override
	public void genericPlaceSearch(PlaceSearch search) {
		// TODO Auto-generated method stub
		
		Iterator<PlaceDTO> iterator = addPlace.iterator();
		while (iterator.hasNext()) {
			PlaceDTO dto=  iterator.next();
			if(search.nameAndLocation(dto)|| search.nameAndLocationAndPincodeSearch(dto)){
				System.out.println("dto is found");
			}
			else
				System.out.println("dto is not found");
	}
	
}


}

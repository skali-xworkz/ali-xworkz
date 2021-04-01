package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dao.PlaceDAO;
import com.xworkz.xworkzapp.dao.PlaceDAOImp;
import com.xworkz.xworkzapp.service.PlaceSearch;
import com.xworkz.xworkzapp.service.PlaceSearchServiceImp;

public class PlaceTester {

	public static void main(String[] args) {
		PlaceDAO pd = new PlaceDAOImp();

		PlaceSearch ps = new PlaceSearchServiceImp();
		pd.genericPlaceSearch(ps);

	}
}

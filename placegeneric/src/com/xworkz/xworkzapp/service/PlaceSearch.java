package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.PlaceDTO;

public interface PlaceSearch {
boolean nameAndLocation(PlaceDTO dto);
boolean nameAndLocationAndPincodeSearch(PlaceDTO dto);

}
